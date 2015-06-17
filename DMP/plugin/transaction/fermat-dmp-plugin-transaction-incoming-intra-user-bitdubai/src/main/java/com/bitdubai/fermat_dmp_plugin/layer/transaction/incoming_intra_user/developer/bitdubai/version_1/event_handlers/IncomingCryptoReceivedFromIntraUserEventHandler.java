package com.bitdubai.fermat_dmp_plugin.layer.transaction.incoming_intra_user.developer.bitdubai.version_1.event_handlers;

import com.bitdubai.fermat_api.Service;
import com.bitdubai.fermat_api.layer.dmp_transaction.TransactionServiceNotStartedException;
import com.bitdubai.fermat_api.layer.dmp_transaction.incoming_intra_user.IncomingIntraUserManager;
import com.bitdubai.fermat_api.layer.all_definition.enums.ServiceStatus;
import com.bitdubai.fermat_api.layer.all_definition.event.PlatformEvent;
import com.bitdubai.fermat_api.layer.pip_platform_service.event_manager.EventHandler;
import com.bitdubai.fermat_api.layer.cry_crypto_module.actor_address_book.exceptions.ExampleException;

/**
 * Created by loui on 23/02/15.
 */
public class IncomingCryptoReceivedFromIntraUserEventHandler implements EventHandler {
    IncomingIntraUserManager incomingIntraUserManager;

    public void setIncomingIntraUserManager(IncomingIntraUserManager incomingIntraUserManager){
        this.incomingIntraUserManager = incomingIntraUserManager;

    }
    
    @Override
    public void handleEvent(PlatformEvent platformEvent) throws Exception {
        if (((Service) this.incomingIntraUserManager).getStatus() == ServiceStatus.STARTED){

            try
            {
                this.incomingIntraUserManager.exampleMethod();
            }
            catch (ExampleException exampleException)
            {
                /**
                 * The main module could not handle this exception. Me neither. Will throw it again.
                 */
                System.err.println("CantCreateCryptoWalletException: "+ exampleException.getMessage());
                exampleException.printStackTrace();

                throw  exampleException;
            }
        }
        else
        {
            throw new TransactionServiceNotStartedException();
        }
    }
}