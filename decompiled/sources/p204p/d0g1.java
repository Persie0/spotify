package p204p;

import com.google.android.recaptcha.internal.zzhg;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public interface d0g1 {
    /* JADX INFO: renamed from: a */
    default cog1 mo34534a(kef1 kef1Var) {
        return new cog1(new rp2(2, 2, null));
    }

    /* JADX INFO: renamed from: b */
    cog1 mo34535b(aef1 aef1Var);

    /* JADX INFO: renamed from: c */
    default gzf1 mo34536c(Exception exc) {
        int i = 27;
        if (!(exc instanceof TimeoutCancellationException) && (!(exc instanceof zzhg) || !wj50.m88271j(((zzhg) exc).f2336b, zz11.f287824e))) {
            i = 2;
        }
        int iZza = zza();
        sff1 sff1VarM80666w = tff1.m80666w();
        sff1VarM80666w.m78004i(iZza);
        sff1VarM80666w.m78005j(13);
        sff1VarM80666w.m78006k(i);
        return q3d0.m72090U(this, (tff1) sff1VarM80666w.m52814g());
    }

    /* JADX INFO: renamed from: d */
    default aog1 m34537d(kef1 kef1Var) {
        return new aog1(36, new dnc(this, kef1Var, null, 21), new Integer(zza()));
    }

    /* JADX INFO: renamed from: e */
    default cog1 m34538e(String str, aef1 aef1Var) {
        return new cog1(new ozf1(this, str, aef1Var, null, 1));
    }

    int zza();

    boolean zzb();
}
