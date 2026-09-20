package com.spotify.esperanto.esperantocosmos;

import com.spotify.cosmos.cosmos.Response;
import kotlin.Metadata;
import p204p.dq60;
import p204p.edb;
import p204p.gh00;
import p204p.qe70;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m24212d2 = {"<anonymous>", "", "response", "Lcom/spotify/cosmos/cosmos/Response;", "invoke"}, m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosTransport$call$mapFunc$1 extends qe70 implements gh00 {
    final /* synthetic */ String $uri;
    final /* synthetic */ CosmosTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CosmosTransport$call$mapFunc$1(CosmosTransport cosmosTransport, String str) {
        super(1);
        this.this$0 = cosmosTransport;
        this.$uri = str;
    }

    @Override // p204p.gh00
    public final byte[] invoke(Response response) {
        if (response.getStatus() == 200) {
            byte[] body = response.getBody();
            return body == null ? new byte[0] : body;
        }
        byte[] body2 = response.getBody();
        throw new RuntimeException(dq60.m36616p(body2 != null ? new String(body2, this.this$0.CHARSET_UTF8) : new String(), "'", edb.m38571t(response.getStatus(), "Response for [", this.$uri, "] returned with status code ", ": '")));
    }
}
