package p204p;

import com.spotify.identity.proto.p081v3.Identity$UserProfile;

/* JADX INFO: loaded from: classes10.dex */
public final class bsr0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Identity$UserProfile f30380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bsr0(Identity$UserProfile identity$UserProfile, int i) {
        super(0);
        this.f30379a = i;
        this.f30380b = identity$UserProfile;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f30379a) {
            case 0:
                return this.f30380b.m11951v();
            default:
                return this.f30380b.m11949t();
        }
    }
}
