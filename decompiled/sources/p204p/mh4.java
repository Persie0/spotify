package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f143697a;

    /* JADX INFO: renamed from: b */
    public final boolean f143698b;

    /* JADX INFO: renamed from: c */
    public final boolean f143699c;

    /* JADX INFO: renamed from: d */
    public final bji f143700d;

    /* JADX INFO: renamed from: e */
    public final wg61 f143701e = new wg61(new bh4(this, 4));

    public mh4(int i, bji bjiVar, boolean z, boolean z2) {
        this.f143697a = i;
        this.f143698b = z;
        this.f143699c = z2;
        this.f143700d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m61736a() {
        mh4 mh4Var = (mh4) this.f143701e.getValue();
        return mh4Var != null ? mh4Var.m61736a() : this.f143697a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61737b() {
        mh4 mh4Var = (mh4) this.f143701e.getValue();
        return mh4Var != null ? mh4Var.m61737b() : this.f143699c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61738c() {
        mh4 mh4Var = (mh4) this.f143701e.getValue();
        return mh4Var != null ? mh4Var.m61738c() : this.f143698b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("cache_refresh_interval", "android-messaging-clientmessagingplatform-clientmessagingplatformproperties", m61736a(), 0, 86400), new k8a("is_click_action_enum_enabled", "android-messaging-clientmessagingplatform-clientmessagingplatformproperties", m61738c()), new k8a("use_sealed_message_serialization", "android-messaging-clientmessagingplatform-clientmessagingplatformproperties", m61737b()));
    }
}
