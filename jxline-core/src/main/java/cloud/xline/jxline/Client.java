package cloud.xline.jxline;

public interface Client extends io.etcd.jetcd.Client {

    ProtocolClient getProtocolClient();

    /**
     * Override the jetcd.cloud.xline.client.Client.builder
     *
     * @return {@link ClientBuilder}
     */
    static ClientBuilder builder() {
        return new ClientBuilder();
    }
}
