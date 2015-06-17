package unit.com.bitdubai.fermat_api.layer._1_definition.communication.cloud.CloudFMPConnectionManager;

import org.junit.Test;

import com.bitdubai.fermat_p2p_api.layer.p2p_communication.cloud_server.CloudConnectionException;
import com.bitdubai.fermat_api.layer.all_definition.communication.cloud.CloudFMPConnectionManager;

public class StartServerTest extends CloudFMPConnectionManagerUnitTest {
	
	private CloudFMPConnectionManager testManager;
	
	private int tcpPortPadding = TCP_BASE_TEST_PORT + 200;
	
	@Test
	public void Start_Successful_isRunning() throws Exception{
		setUpParameters(tcpPortPadding+1);
		testManager = new MockCloudFMPConnectionManagerServer(testAddress, testExecutor, testPrivateKey, testPublicKey);
		assertThat(testManager.isRunning()).isFalse();
		testManager.start();
		assertThat(testManager.isRunning()).isTrue();
	}
	
	@Test(expected=CloudConnectionException.class)
	public void DoubleStart_Successful_isRunning() throws Exception{
		setUpParameters(tcpPortPadding+2);
		testManager = new MockCloudFMPConnectionManagerServer(testAddress, testExecutor, testPrivateKey, testPublicKey);
		testManager.start();
		testManager.start();
	}

}