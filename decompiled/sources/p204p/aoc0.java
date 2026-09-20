package p204p;

import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class aoc0 implements ync0 {

    /* JADX INFO: renamed from: a */
    public final z5f f17642a;

    /* JADX INFO: renamed from: b */
    public final ud80 f17643b;

    /* JADX INFO: renamed from: c */
    public final om0 f17644c;

    /* JADX INFO: renamed from: d */
    public final ryq0 f17645d;

    public aoc0(z5f z5fVar, ud80 ud80Var, om0 om0Var, ryq0 ryq0Var) {
        this.f17642a = z5fVar;
        this.f17643b = ud80Var;
        this.f17644c = om0Var;
        this.f17645d = ryq0Var;
    }

    @Override // p204p.ync0
    /* JADX INFO: renamed from: a */
    public final Observable mo26573a(String str) {
        Set set = dd41.f47702f;
        if (r46.m74726U(str).f47709c == gn80.PRERELEASE) {
            Observable observableDistinctUntilChanged = this.f17645d.m76738b(str).distinctUntilChanged();
            wj50.m88279p(observableDistinctUntilChanged);
            return observableDistinctUntilChanged;
        }
        Observable map = z5f.m95457d(this.f17642a, "", new String[]{str}).distinctUntilChanged().map(new aqs(str, 11));
        wj50.m88279p(map);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (p204p.ud80.m82842g(r1, r10, true, r0, 4) == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (p204p.ud80.m82840b(r1, r10, true, r0, 4) == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return r4;
     */
    @Override // p204p.ync0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo26574b(String str, String str2, ibk ibkVar, boolean z) {
        znc0 znc0Var;
        if (ibkVar instanceof znc0) {
            znc0Var = (znc0) ibkVar;
            int i = znc0Var.f284467e;
            if ((i & Integer.MIN_VALUE) != 0) {
                znc0Var.f284467e = i - Integer.MIN_VALUE;
            } else {
                znc0Var = new znc0(this, ibkVar);
            }
        } else {
            znc0Var = new znc0(this, ibkVar);
        }
        Object obj = znc0Var.f284465c;
        int i2 = znc0Var.f284467e;
        if (i2 == 0) {
            bga.m29073P(obj);
            ud80 ud80Var = this.f17643b;
            yuk yukVar = yuk.f276404a;
            if (z) {
                znc0Var.f284464b = str2;
                znc0Var.f284463a = z;
                znc0Var.f284467e = 1;
            } else {
                znc0Var.f284464b = str2;
                znc0Var.f284463a = z;
                znc0Var.f284467e = 2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = znc0Var.f284463a;
            str2 = znc0Var.f284464b;
            bga.m29073P(obj);
        }
        String str3 = str2;
        if (!z) {
            om0.m67311c(this.f17644c, qm0.CLICKED, str3, 0L, "heart", null, null, null, ContentType.LONG_FORM_ON_DEMAND);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.ync0
    /* JADX INFO: renamed from: c */
    public final Completable mo26575c(String str, String str2, boolean z) {
        if (!z) {
            om0.m67311c(this.f17644c, qm0.CLICKED, str2, 0L, "heart", null, null, null, ContentType.LONG_FORM_ON_DEMAND);
        }
        return this.f17645d.m76740d(str, !z);
    }
}
