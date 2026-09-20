package p204p;

import android.os.Bundle;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e3y0 implements o9d0 {

    /* JADX INFO: renamed from: a */
    public final tz8 f55901a;

    /* JADX INFO: renamed from: b */
    public final yjx0 f55902b;

    /* JADX INFO: renamed from: c */
    public final ExternalAccessoryDescription f55903c;

    /* JADX INFO: renamed from: d */
    public final zj4 f55904d;

    /* JADX INFO: renamed from: e */
    public final sr31 f55905e;

    /* JADX INFO: renamed from: f */
    public final stt f55906f;

    /* JADX INFO: renamed from: g */
    public final hol0 f55907g;

    /* JADX INFO: renamed from: h */
    public di41 f55908h;

    /* JADX INFO: renamed from: i */
    public final c9k f55909i;

    public e3y0(hji hjiVar, uzx uzxVar, xnd0 xnd0Var, byn bynVar, zj4 zj4Var, sr31 sr31Var, luk lukVar, stt sttVar, hol0 hol0Var) {
        tz8 tz8VarM30898b = bynVar.m30898b(hjiVar, uzxVar, xnd0Var);
        yjx0 yjx0Var = hjiVar.f92055b;
        ExternalAccessoryDescription externalAccessoryDescription = hjiVar.f92057d;
        this.f55901a = tz8VarM30898b;
        this.f55902b = yjx0Var;
        this.f55903c = externalAccessoryDescription;
        this.f55904d = zj4Var;
        this.f55905e = sr31Var;
        this.f55906f = sttVar;
        this.f55907g = hol0Var;
        this.f55909i = kk40.m56661c(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.gh00] */
    /* JADX WARN: Type inference failed for: r12v1, types: [p.gh00] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v0, types: [p.th00] */
    /* JADX WARN: Type inference failed for: r13v1, types: [p.th00] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX INFO: renamed from: m */
    public static final Object m37695m(e3y0 e3y0Var, String str, String str2, ye30 ye30Var, gh00 gh00Var, th00 th00Var, ibk ibkVar) {
        d3y0 d3y0Var;
        Object objM79316a;
        String str3;
        ?? r13;
        ?? r12;
        tz8 tz8Var = e3y0Var.f55901a;
        if (ibkVar instanceof d3y0) {
            d3y0Var = (d3y0) ibkVar;
            int i = d3y0Var.f45035f;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3y0Var.f45035f = i - Integer.MIN_VALUE;
            } else {
                d3y0Var = new d3y0(e3y0Var, ibkVar);
            }
        } else {
            d3y0Var = new d3y0(e3y0Var, ibkVar);
        }
        d3y0 d3y0Var2 = d3y0Var;
        Object obj = d3y0Var2.f45033d;
        int i2 = d3y0Var2.f45035f;
        if (i2 == 0) {
            bga.m29073P(obj);
            stt sttVar = e3y0Var.f55906f;
            String strM47689b = tz8Var.f225177a.m47689b();
            d3y0Var2.f45030a = str2;
            d3y0Var2.f45031b = (qe70) gh00Var;
            d3y0Var2.f45032c = (qe70) th00Var;
            d3y0Var2.f45035f = 1;
            objM79316a = sttVar.m79316a(str, str2, strM47689b, ye30Var, d3y0Var2);
            yuk yukVar = yuk.f276404a;
            if (objM79316a == yukVar) {
                return yukVar;
            }
            str3 = str2;
            r12 = gh00Var;
            r13 = th00Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th00 th00Var2 = (th00) d3y0Var2.f45032c;
            gh00 gh00Var2 = (gh00) d3y0Var2.f45031b;
            str3 = d3y0Var2.f45030a;
            bga.m29073P(obj);
            objM79316a = ((s6x0) obj).f206218a;
            r12 = gh00Var2;
            r13 = th00Var2;
        }
        Throwable thM77348a = s6x0.m77348a(objM79316a);
        w2a1 w2a1Var = w2a1.f247311a;
        if (thM77348a != null) {
            String message = thM77348a.getMessage();
            if (message == null) {
                message = "Unknown error during search.";
            }
            r13.invoke(i9d0.f99991c, message);
            return w2a1Var;
        }
        List listMo27650g = e3y0Var.f55905e.mo27650g((List) objM79316a, str3 == null ? tz8Var.f225177a.m47689b() : str3, e3y0Var.f55902b.f273498g);
        if (wj50.m88271j(str3, "com.samsung.android.smartsuggestions")) {
            ArrayList arrayList = new ArrayList(i6f.m49804T(listMo27650g, 10));
            for (j8d0 j8d0Var : (ArrayList) listMo27650g) {
                arrayList.add(new j8d0(j8d0Var.f109906a, j8d0Var.f109907b, "", j8d0Var.f109909d, j8d0Var.f109910e, j8d0Var.f109911f, j8d0Var.f109912g));
            }
            listMo27650g = arrayList;
        }
        r12.invoke(listMo27650g);
        return w2a1Var;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: a */
    public final Set mo36678a() {
        return this.f55901a.mo36678a();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: b */
    public final void mo37696b(zvm0 zvm0Var) {
        this.f55901a.mo37696b(zvm0Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: c */
    public final void mo36679c(zvm0 zvm0Var, Bundle bundle, gh00 gh00Var) {
        this.f55901a.mo36679c(zvm0Var, bundle, gh00Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: d */
    public final zvm0 mo37697d() {
        return this.f55901a.f225177a.m47690c();
    }

    @Override // p204p.o9d0
    public final void destroy() {
        this.f55901a.destroy();
        kk40.m56680v(this.f55909i, null);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: e */
    public final void mo36680e(String str, Bundle bundle, String str2, ye30 ye30Var, gh00 gh00Var, th00 th00Var, eh00 eh00Var) {
        if (wj50.m88271j(str2, "com.samsung.android.smartsuggestions") && this.f55904d.m96226a()) {
            th00Var.invoke(i9d0.f99989a, "Samsung Now Brief is disabled.");
            return;
        }
        di41 di41Var = this.f55908h;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f55908h = x0h1.m89578u(this.f55909i, null, 0, new mm0(this, str2, bundle, str, ye30Var, gh00Var, th00Var, eh00Var, (fbk) null), 3);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: f */
    public final xnd0 mo37698f() {
        return this.f55901a.f225179c;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: g */
    public final long mo37699g() {
        return this.f55901a.f225191o;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: h */
    public final boolean mo37700h() {
        return this.f55901a.mo37700h();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: i */
    public final void mo37701i(zvm0 zvm0Var) {
        this.f55901a.mo37701i(zvm0Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: j */
    public final void mo37702j(zvm0 zvm0Var) {
        this.f55901a.mo37702j(zvm0Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: k */
    public final boolean mo36681k() {
        return this.f55901a.mo36681k();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: l */
    public final String mo37703l() {
        return this.f55901a.f225177a.m47689b();
    }
}
