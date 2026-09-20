package p204p;

import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class coc0 implements ync0 {

    /* JADX INFO: renamed from: a */
    public final z5f f40230a;

    /* JADX INFO: renamed from: b */
    public final ud80 f40231b;

    /* JADX INFO: renamed from: c */
    public final om0 f40232c;

    /* JADX INFO: renamed from: d */
    public final rrc0 f40233d;

    /* JADX INFO: renamed from: e */
    public final ryq0 f40234e;

    public coc0(z5f z5fVar, ud80 ud80Var, om0 om0Var, rrc0 rrc0Var, ryq0 ryq0Var) {
        this.f40230a = z5fVar;
        this.f40231b = ud80Var;
        this.f40232c = om0Var;
        this.f40233d = rrc0Var;
        this.f40234e = ryq0Var;
    }

    @Override // p204p.ync0
    /* JADX INFO: renamed from: a */
    public final Observable mo26573a(String str) {
        Set set = dd41.f47702f;
        if (r46.m74726U(str).f47709c == gn80.PRERELEASE) {
            Observable observableDistinctUntilChanged = this.f40234e.m76738b(str).distinctUntilChanged();
            wj50.m88279p(observableDistinctUntilChanged);
            return observableDistinctUntilChanged;
        }
        Observable map = z5f.m95457d(this.f40230a, "", new String[]{str}).distinctUntilChanged().map(new vah1(str, 15));
        wj50.m88279p(map);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (p204p.ud80.m82842g(r1, r6, true, r0, 4) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (p204p.ud80.m82840b(r1, r6, true, r0, 4) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        return r4;
     */
    @Override // p204p.ync0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo26574b(String str, String str2, ibk ibkVar, boolean z) {
        boc0 boc0Var;
        if (ibkVar instanceof boc0) {
            boc0Var = (boc0) ibkVar;
            int i = boc0Var.f29072f;
            if ((i & Integer.MIN_VALUE) != 0) {
                boc0Var.f29072f = i - Integer.MIN_VALUE;
            } else {
                boc0Var = new boc0(this, ibkVar);
            }
        } else {
            boc0Var = new boc0(this, ibkVar);
        }
        Object obj = boc0Var.f29070d;
        int i2 = boc0Var.f29072f;
        if (i2 == 0) {
            bga.m29073P(obj);
            ud80 ud80Var = this.f40231b;
            yuk yukVar = yuk.f276404a;
            if (z) {
                boc0Var.f29068b = str;
                boc0Var.f29069c = str2;
                boc0Var.f29067a = z;
                boc0Var.f29072f = 1;
            } else {
                boc0Var.f29068b = str;
                boc0Var.f29069c = str2;
                boc0Var.f29067a = z;
                boc0Var.f29072f = 2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = boc0Var.f29067a;
            str2 = boc0Var.f29069c;
            str = boc0Var.f29068b;
            bga.m29073P(obj);
        }
        m33496d(str2, str, z);
        return w2a1.f247311a;
    }

    @Override // p204p.ync0
    /* JADX INFO: renamed from: c */
    public final Completable mo26575c(String str, String str2, boolean z) {
        m33496d(str2, str, z);
        return this.f40234e.m76740d(str, !z);
    }

    /* JADX INFO: renamed from: d */
    public final void m33496d(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = str;
        } else {
            str3 = str;
            om0.m67311c(this.f40232c, qm0.CLICKED, str3, 0L, "heart", null, null, null, ContentType.LONG_FORM_ON_DEMAND);
        }
        this.f40233d.m76285c(z ? 6 : 5, str2, str3);
    }
}
