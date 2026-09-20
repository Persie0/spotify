package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zz70 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f287906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz70(String str, int i) {
        super(1);
        this.f287905a = i;
        this.f287906b = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f287905a) {
            case 0:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 1:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 2:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 3:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 4:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m53989c(mpz0Var);
                jpz0.m54000n(mpz0Var, this.f287906b);
                return w2a1.f247311a;
            case 5:
                ((cqx) obj).m33646a(this.f287906b, fs11.class, false);
                return w2a1.f247311a;
            case 6:
                return this.f287906b;
            case 7:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 8:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 9:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 10:
                ((cqx) obj).m33646a(this.f287906b, maw.class, false);
                return w2a1.f247311a;
            case 11:
                return s601.m77308k0(this.f287906b, (Set) obj);
            case 12:
                return s601.m77304g0(this.f287906b, (Set) obj);
            case 13:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 14:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 15:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("SELECT EXISTS(SELECT 1 FROM lyrics_entities WHERE track_id = ?)");
                try {
                    boolean z = true;
                    ezx0VarMo63454G1.mo24842R(1, this.f287906b);
                    Boolean boolValueOf = null;
                    if (ezx0VarMo63454G1.mo24841E1()) {
                        Integer numValueOf = ezx0VarMo63454G1.isNull(0) ? null : Integer.valueOf((int) ezx0VarMo63454G1.getLong(0));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        break;
                    }
                    return boolValueOf;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 16:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 17:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 18:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54000n(mpz0Var2, this.f287906b);
                jpz0.m54004r(mpz0Var2, 0);
                return w2a1.f247311a;
            case 19:
                mpz0 mpz0Var3 = (mpz0) obj;
                jpz0.m54000n(mpz0Var3, this.f287906b);
                jpz0.m53989c(mpz0Var3);
                return w2a1.f247311a;
            case 20:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 21:
                mpz0 mpz0Var4 = (mpz0) obj;
                jpz0.m54000n(mpz0Var4, this.f287906b);
                jpz0.m54004r(mpz0Var4, 0);
                return w2a1.f247311a;
            case 22:
                return ((Context) obj).getString(R.string.media_trimmer_lyrics_provider_label, this.f287906b);
            case 23:
                ((cqx) obj).m33646a(this.f287906b, ks81.class, false);
                return w2a1.f247311a;
            case 24:
                ((cqx) obj).m33646a(this.f287906b, erc1.class, false);
                return w2a1.f247311a;
            case 25:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            case 26:
                return ((glg0) obj).m45147e(this.f287906b);
            case 27:
                return ((glg0) obj).m45148h(this.f287906b);
            case 28:
                jpz0.m54000n((mpz0) obj, this.f287906b);
                return w2a1.f247311a;
            default:
                return new mjg0((slg0) obj, this.f287906b);
        }
    }
}
