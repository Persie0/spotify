package p204p;

import android.content.SharedPreferences;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p.xr */
/* JADX INFO: loaded from: classes17.dex */
public final class C2585xr implements InterfaceC2024jq, InterfaceC1823eq {

    /* JADX INFO: renamed from: n */
    public static final long f265162n = TimeUnit.HOURS.toMillis(8);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f265163o = 0;

    /* JADX INFO: renamed from: a */
    public final C2141mv f265164a;

    /* JADX INFO: renamed from: b */
    public final s140 f265165b;

    /* JADX INFO: renamed from: c */
    public final Observable f265166c;

    /* JADX INFO: renamed from: d */
    public final Observable f265167d;

    /* JADX INFO: renamed from: e */
    public final Flowable f265168e;

    /* JADX INFO: renamed from: f */
    public final mi7 f265169f;

    /* JADX INFO: renamed from: g */
    public final jf61 f265170g;

    /* JADX INFO: renamed from: h */
    public final C2390sv f265171h;

    /* JADX INFO: renamed from: i */
    public final C1786dq f265172i;

    /* JADX INFO: renamed from: j */
    public final i8a f265173j;

    /* JADX INFO: renamed from: k */
    public final luk f265174k;

    /* JADX INFO: renamed from: l */
    public volatile Boolean f265175l;

    /* JADX INFO: renamed from: m */
    public c9k f265176m;

    public C2585xr(C2141mv c2141mv, s140 s140Var, xre xreVar, Observable observable, Observable observable2, Flowable flowable, mi7 mi7Var, jf61 jf61Var, C2390sv c2390sv, C1786dq c1786dq, i8a i8aVar, luk lukVar) {
        this.f265164a = c2141mv;
        this.f265165b = s140Var;
        this.f265166c = observable;
        this.f265167d = observable2;
        this.f265168e = flowable;
        this.f265169f = mi7Var;
        this.f265170g = jf61Var;
        this.f265171h = c2390sv;
        this.f265172i = c1786dq;
        this.f265173j = i8aVar;
        this.f265174k = lukVar;
    }

    /* JADX INFO: renamed from: l */
    public static final Single m91904l(C2585xr c2585xr, C1993iw c1993iw) {
        return c2585xr.f265164a.m62884b(c1993iw.m51772b(), false).map(new C2063kr(c2585xr, c1993iw, 1)).onErrorReturn(new C2187nr(c1993iw, 0)).flatMap(new C2063kr(c2585xr, c1993iw, 2)).doOnSuccess(new C1989ir(c2585xr, c1993iw));
    }

    /* JADX INFO: renamed from: m */
    public static final C1681av m91905m(C2585xr c2585xr, C1993iw c1993iw) {
        return new C1681av(c1993iw.m51772b().f251542a, c1993iw.m51774d(), c1993iw.m51775e(), c1993iw.m51773c(), c1993iw.m51778h(), c1993iw.m51776f());
    }

    /* JADX INFO: renamed from: o */
    public static int m91906o(C1681av c1681av) {
        if (c1681av == null) {
            return 3;
        }
        return c1681av.m27221c() ? 2 : 1;
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: a */
    public final Single mo54013a(String str) {
        C1993iw c1993iwM91908p = m91908p(str);
        if (c1993iwM91908p != null) {
            C1786dq c1786dq = this.f265172i;
            c1786dq.m36594f(str);
            return new CompletableToSingle(this.f265171h.m79421b(new igw0(c1993iwM91908p.m51778h() ? 2 : 1, Integer.valueOf(c1786dq.m36595g()))), C2225or.f168405b, null);
        }
        Single singleJust = Single.just(Boolean.FALSE);
        wj50.m88279p(singleJust);
        return singleJust;
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: b */
    public final Single mo54014b(ms41 ms41Var) {
        return this.f265168e.m23327A().flatMap(new C2311qr(this, ms41Var)).onErrorReturn(C2100lr.f136171c);
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: c */
    public final Single mo39712c(String str, String str2, boolean z) {
        Single singleFlatMap;
        C1993iw c1993iwM91908p = m91908p(str);
        return (c1993iwM91908p == null || (singleFlatMap = this.f265166c.firstOrError().flatMap(new C2506vr(this, c1993iwM91908p, str, str2, z))) == null) ? Single.just(Boolean.FALSE) : singleFlatMap;
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: d */
    public final Single mo39713d(String str) {
        return this.f265166c.firstOrError().flatMap(new C2025jr(this, sh7.f209123X, str));
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: e */
    public final fiz mo39714e() {
        C1786dq c1786dq = this.f265172i;
        c1786dq.getClass();
        return xtm0.m92103x(cyf1.m34374j(new C2466up(gyf1.m46145k(b0g1.m27778N(nxf1.m65827f(new C2583xp(c1786dq, null))), C2621yp.f274779a)), c1786dq.f51772d), new C1714bq(this, null));
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: f */
    public final C1681av mo39715f() {
        Object next;
        Iterator it = this.f265172i.m36592c().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long lM51776f = ((C1993iw) next).m51776f();
                long jLongValue = lM51776f != null ? lM51776f.longValue() : 0L;
                do {
                    Object next2 = it.next();
                    Long lM51776f2 = ((C1993iw) next2).m51776f();
                    long jLongValue2 = lM51776f2 != null ? lM51776f2.longValue() : 0L;
                    if (jLongValue < jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C1993iw c1993iw = (C1993iw) next;
        if (c1993iw != null) {
            return new C1681av(c1993iw.m51772b().f251542a, c1993iw.m51774d(), c1993iw.m51775e(), c1993iw.m51773c(), c1993iw.m51778h(), c1993iw.m51776f());
        }
        return null;
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: g */
    public final Single mo39716g(String str) {
        return this.f265166c.firstOrError().flatMap(new C2025jr(this, sh7.f209124Y, str));
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: h */
    public final Single mo54015h(ArrayList arrayList) {
        return Single.defer(new C2348rr(arrayList, this));
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: i */
    public final boolean mo39717i() {
        Boolean bool = this.f265175l;
        return (!this.f265173j.isEnabled() || bool == null) ? !this.f265172i.m36592c().isEmpty() : bool.booleanValue();
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: j */
    public final Single mo39718j() {
        return m91907n(this.f265172i.m36592c());
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: k */
    public final void mo54016k() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        SharedPreferences sharedPreferencesM36591b = this.f265172i.m36591b();
        if (sharedPreferencesM36591b == null || (editorEdit = sharedPreferencesM36591b.edit()) == null || (editorClear = editorEdit.clear()) == null) {
            return;
        }
        editorClear.apply();
    }

    /* JADX INFO: renamed from: n */
    public final Single m91907n(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f265168e.m23327A().flatMap(new C2063kr(this, (C1993iw) it.next(), 0)));
        }
        return this.f265166c.filter(C2100lr.f136170b).timeout(800L, TimeUnit.MILLISECONDS, Observable.just(C2590xv.f266234a)).firstOrError().flatMap(new C2137mr(this, 0)).flatMap(new C1952hr(1, this, arrayList));
    }

    /* JADX INFO: renamed from: p */
    public final C1993iw m91908p(String str) {
        C1786dq c1786dq = this.f265172i;
        SharedPreferences sharedPreferencesM36591b = c1786dq.m36591b();
        return c1786dq.m36590a(str, sharedPreferencesM36591b != null ? sharedPreferencesM36591b.getString(str, null) : null);
    }

    /* JADX INFO: renamed from: q */
    public final l4y0 m91909q(C1993iw c1993iw) {
        Object obj;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        String str = c1993iw.m51772b().f251542a;
        C1786dq c1786dq = this.f265172i;
        c1786dq.getClass();
        l4y0 h4y0Var = f4y0.f65854a;
        String str2 = c1993iw.m51772b().f251542a;
        try {
            String strM71208b = ((C2271pw) c1786dq.f51775g.getValue()).m71208b(c1993iw);
            if (strM71208b == null) {
                h4y0Var = new h4y0(new C1681av(c1993iw.m51772b().f251542a, c1993iw.m51774d(), c1993iw.m51775e(), c1993iw.m51773c(), c1993iw.m51778h(), c1993iw.m51776f()));
            } else {
                SharedPreferences sharedPreferencesM36591b = c1786dq.m36591b();
                if (sharedPreferencesM36591b != null && (editorEdit = sharedPreferencesM36591b.edit()) != null && (editorPutString = editorEdit.putString(str2, strM71208b)) != null) {
                    editorPutString.commit();
                    h4y0Var = new h4y0(new C1681av(c1993iw.m51772b().f251542a, c1993iw.m51774d(), c1993iw.m51775e(), c1993iw.m51773c(), c1993iw.m51778h(), c1993iw.m51776f()));
                }
            }
        } catch (IOException e) {
            Logger.m3967c(e, "AccountSwitching: Could not serialize user info for " + str2, new Object[0]);
        }
        if ((h4y0Var instanceof h4y0) && c1786dq.m36595g() > this.f265170g.f111830a.m88903a()) {
            Iterator it = c1786dq.m36592c().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Long lM51776f = ((C1993iw) next).m51776f();
                    long jLongValue = lM51776f != null ? lM51776f.longValue() : Long.MAX_VALUE;
                    do {
                        Object next2 = it.next();
                        Long lM51776f2 = ((C1993iw) next2).m51776f();
                        long jLongValue2 = lM51776f2 != null ? lM51776f2.longValue() : Long.MAX_VALUE;
                        if (jLongValue > jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            C1993iw c1993iw2 = (C1993iw) obj;
            if (c1993iw2 != null) {
                String str3 = c1993iw2.m51772b().f251542a;
                c1786dq.m36594f(c1993iw2.m51772b().f251542a);
            }
        }
        return h4y0Var;
    }

    @Override // p204p.InterfaceC1823eq
    public final void start() {
        if (this.f265173j.isEnabled()) {
            c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(njg1.m64613f(), this.f265174k));
            this.f265176m = c9kVarM56661c;
            x0h1.m89578u(c9kVarM56661c, null, 0, new C2386sr(this, null), 3);
        }
    }

    @Override // p204p.InterfaceC1823eq
    public final void stop() {
        c9k c9kVar = this.f265176m;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f265175l = null;
    }
}
