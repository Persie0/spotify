package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.eventsender.musicintegration.contexts.proto.ClientId;

/* JADX INFO: loaded from: classes.dex */
public final class bke implements s4x {
    @Override // p204p.s4x
    /* JADX INFO: renamed from: a */
    public final String mo29679a() {
        return "context_client_id";
    }

    @Override // p204p.s4x
    public final AbstractC0269h getData() {
        ake akeVarM9820o = ClientId.m9820o();
        byte[] bArrM89349a = wy8.f256230b.m86713g().m89349a("9a8d2f0ce77a4e248bb71fefcb557637");
        akeVarM9820o.m26214m(gva.m45886d(0, bArrM89349a, bArrM89349a.length));
        return akeVarM9820o.build();
    }
}
