package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nn40 implements pb31, Function, InterfaceC2207oa, xc20, luz0, Predicate {

    /* JADX INFO: renamed from: c */
    public static final nn40 f156323c;

    /* JADX INFO: renamed from: d */
    public static final nn40 f156324d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156325a;

    /* JADX INFO: renamed from: b */
    public boolean f156326b;

    static {
        int i = 0;
        f156323c = new nn40(true, i);
        f156324d = new nn40(false, i);
    }

    public /* synthetic */ nn40(int i) {
        this.f156325a = i;
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: a */
    public void mo49911a(up60 up60Var, up60 up60Var2, rr60 rr60Var) {
        k0e1 kind = rr60Var.getDescriptor().getKind();
        if ((kind instanceof v8q0) || wj50.m88271j(kind, ntz0.f158457z0)) {
            throw new IllegalArgumentException("Serializer for " + up60Var2.mo29111F() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f156326b) {
            if (wj50.m88271j(kind, in51.f103871A0) || wj50.m88271j(kind, jn51.f114021z0) || (kind instanceof aer0) || (kind instanceof otz0)) {
                throw new IllegalArgumentException("Serializer for " + up60Var2.mo29111F() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f156325a) {
            case 9:
                return !this.f156326b;
            default:
                return ((ihi) obj).f102296c == u300.LISTEN_LATER && this.f156326b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z = false;
        switch (this.f156325a) {
            case 4:
                d07 d07Var = (d07) obj;
                if (this.f156326b) {
                    z = ((mv31) d07Var.f43796a).m62894o(d07Var.f43797b.f267528a);
                }
                return Boolean.valueOf(z);
            case 12:
                return new sv10(this.f156326b);
            case 18:
                boolean z2 = !this.f156326b;
                List list = r5j.f196063a;
                return new yfb0(z2, csc1.f41517c);
            case 22:
                return cun0.m33936f((oyx) obj, this.f156326b);
            case 23:
                return cun0.m33936f((oyx) obj, this.f156326b);
            case 25:
                Boolean bool = (Boolean) obj;
                if (this.f156326b && bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                boolean z3 = this.f156326b && playerState.isBuffering();
                if (strUri != null && playerState.isPlaying() && playerState.isPaused() && !z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p204p.xc20
    /* JADX INFO: renamed from: c */
    public boolean mo28677c() {
        return this.f156326b;
    }

    @Override // p204p.xc20
    /* JADX INFO: renamed from: e */
    public boolean mo28678e(ci21 ci21Var) {
        return this.f156326b;
    }

    /* JADX INFO: renamed from: h */
    public j45 m65187h() {
        j45 j45Var = new j45(null, false);
        j45Var.f108596c = this.f156326b;
        return j45Var;
    }

    /* JADX INFO: renamed from: i */
    public boolean m65188i() {
        return this.f156326b;
    }

    /* JADX INFO: renamed from: j */
    public String m65189j() {
        return this.f156326b ? ihf1.m50638v() : ihf1.m50632p();
    }

    /* JADX INFO: renamed from: k */
    public boolean m65190k() {
        return this.f156326b;
    }

    /* JADX INFO: renamed from: l */
    public bq11 m65191l() {
        mec0 mec0Var = new mec0();
        Boolean bool = Boolean.TRUE;
        mec0Var.put("link", bool);
        mec0Var.put("isBook", bool);
        mec0Var.put("isMusicAndTalk", bool);
        mec0Var.put("publisher", bool);
        mec0Var.put("covers", bool);
        mec0Var.put("name", bool);
        mec0Var.put("isExplicit", bool);
        mec0Var.put("isFollowing", bool);
        mec0Var.put("inCollection", bool);
        mec0Var.put("showOfflineState", kkc0.m56695h0(new pqm0("offline", bool), new pqm0("syncProgress", bool)));
        mec0Var.put("latestPlayedEpisodeLink", bool);
        mec0Var.put("consumptionOrder", bool);
        mec0Var.put("mediaTypeEnum", bool);
        if (!this.f156326b) {
            mec0Var.put("playedTime", bool);
            mec0Var.put("playedPercentage", bool);
        }
        return new bq11(new ql11((a2w) null, new pl11(bk5.m29582E0(new Integer[]{90, 193, 52, 88, 31, 3, 114, 54, 91, 164, 178, 179, 127, 183, 148, 182, 78}), mec0Var.m61540b()), 5));
    }

    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m65192m() {
        this.f156326b = true;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f156325a) {
            case 24:
                return !((Boolean) obj).booleanValue() || this.f156326b;
            default:
                List<api> list = (List) obj;
                boolean z = this.f156326b;
                if (!list.isEmpty()) {
                    for (api apiVar : list) {
                        if (z ? apiVar.mo26697m() : apiVar.isActive()) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    public String toString() {
        switch (this.f156325a) {
            case 0:
                return edb.m38570s(new StringBuilder("IncorrectFragmentation{expected="), !this.f156326b, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nn40(Object obj, boolean z, int i) {
        this.f156325a = i;
        this.f156326b = z;
    }

    public /* synthetic */ nn40(boolean z, int i) {
        this.f156325a = i;
        this.f156326b = z;
    }

    public nn40(xl4 xl4Var) {
        this.f156325a = 26;
        this.f156326b = xl4Var.m91375a();
    }

    public nn40(lq4 lq4Var) {
        this.f156325a = 27;
        this.f156326b = lq4Var.m59693a();
    }

    public nn40(jb4 jb4Var) {
        this.f156325a = 17;
        this.f156326b = jb4Var.m52865a();
    }

    public nn40(x24 x24Var) {
        this.f156325a = 10;
        this.f156326b = x24Var.m89705a();
    }

    public nn40(zh4 zh4Var) {
        this.f156325a = 20;
        this.f156326b = zh4Var.m96113a();
    }

    public nn40(i4t0 i4t0Var) {
        this.f156325a = 15;
        this.f156326b = ((oy3) i4t0Var.get()).m68408a();
    }

    public nn40(qk60 qk60Var) {
        this.f156325a = 14;
        this.f156326b = qk60Var.f189475l != 1;
    }

    public nn40(la80 la80Var) {
        this.f156325a = 2;
        this.f156326b = r3h1.m74671s(la80Var);
    }

    public nn40() {
        this.f156325a = 6;
        this.f156326b = true;
    }

    public nn40(kqk0 kqk0Var, jqk0 jqk0Var) throws iqk0 {
        this.f156325a = 21;
        int i = jqk0Var.f114922a;
        ByteBuffer byteBuffer = jqk0Var.f114923b;
        c95.m31843i(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ohc ohcVar = new ohc(bArr, iMin);
        if (!kqk0Var.f125325a) {
            if (ohcVar.m66953f()) {
                this.f156326b = false;
                return;
            }
            int iM66954g = ohcVar.m66954g(2);
            boolean zM66953f = ohcVar.m66953f();
            if (kqk0Var.f125326b) {
                throw new iqk0();
            }
            if (!zM66953f) {
                this.f156326b = true;
                return;
            }
            boolean zM66953f2 = (iM66954g == 3 || iM66954g == 0) ? true : ohcVar.m66953f();
            ohcVar.m66961n();
            if (kqk0Var.f125328d) {
                if (ohcVar.m66953f()) {
                    if (kqk0Var.f125329e) {
                        ohcVar.m66961n();
                    } else {
                        throw new iqk0();
                    }
                }
                if (!kqk0Var.f125327c) {
                    if (iM66954g != 3) {
                        ohcVar.m66961n();
                    }
                    ohcVar.m66962o(kqk0Var.f125330f);
                    if (iM66954g != 2 && iM66954g != 0 && !zM66953f2) {
                        ohcVar.m66962o(3);
                    }
                    this.f156326b = ((iM66954g == 3 || iM66954g == 0) ? 255 : ohcVar.m66954g(8)) != 0;
                    return;
                }
                throw new iqk0();
            }
            throw new iqk0();
        }
        throw new iqk0();
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: b */
    public void mo49912b(up60 up60Var, gh00 gh00Var) {
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: d */
    public void mo49914d(up60 up60Var, gh00 gh00Var) {
    }

    @Override // p204p.luz0
    /* JADX INFO: renamed from: g */
    public void mo49916g(up60 up60Var, gh00 gh00Var) {
    }
}
