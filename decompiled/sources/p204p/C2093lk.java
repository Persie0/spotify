package p204p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.lk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2093lk {

    /* JADX INFO: renamed from: a */
    public final z9j0 f134189a;

    /* JADX INFO: renamed from: b */
    public final j470 f134190b;

    /* JADX INFO: renamed from: c */
    public C2130mk f134191c = C2130mk.f144441L0;

    /* JADX INFO: renamed from: d */
    public final ArrayList f134192d = new ArrayList();

    public C2093lk(h9y0 h9y0Var, z9j0 z9j0Var, j470 j470Var) {
        this.f134189a = z9j0Var;
        this.f134190b = j470Var;
        h9y0Var.mo34135x().m41112e("account_creation_flow_state");
        h9y0Var.mo34135x().m41110c("account_creation_flow_state", new C1982ik(this, 0));
        if (h9y0Var.mo34135x().f67389a.f77925g) {
            m59204i(h9y0Var);
        }
        h9y0Var.getLifecycle().mo31986a(new C2018jk(0, this, h9y0Var));
    }

    /* JADX INFO: renamed from: a */
    public final void m59197a() {
        this.f134192d.clear();
        this.f134191c = C2130mk.f144441L0;
    }

    /* JADX INFO: renamed from: b */
    public final void m59198b(String str, d850 d850Var) {
        m59197a();
        z9j0 z9j0Var = this.f134189a;
        z9j0Var.mo47343c();
        String str2 = !wl51.m88460J0(str) ? xoc1.f263938M3.m83614b("spotify:internal:managed-account-details:child:".concat(str)).f243453a : xoc1.f264032Z0.f243453a;
        n6j0 n6j0Var = d850Var != null ? new n6j0(d850Var) : null;
        if (str2 == null) {
            throw new IllegalStateException("uri was not set!");
        }
        z9j0Var.mo63651f(new p6j0(str2, "", false, false, 0, 0, false, null, null, n6j0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m59199c(AbstractC2616yk abstractC2616yk, d850 d850Var, Bundle bundle) {
        if (this.f134192d.isEmpty()) {
            na6.m63957e("completeStep(" + abstractC2616yk + ") called with no steps, flow state lost. Aborting flow.");
            m59197a();
            this.f134189a.mo47343c();
            return;
        }
        String string = bundle.getString("pin");
        if (string != null) {
            this.f134191c = C2130mk.m62051c(this.f134191c, string, null, null, null, null, null, null, null, null, null, false, 0, null, 8190);
        }
        String string2 = bundle.getString("name");
        if (string2 != null) {
            this.f134191c = C2130mk.m62051c(this.f134191c, null, string2, null, null, null, null, null, null, null, null, false, 0, null, 8189);
        }
        String string3 = bundle.getString("birthday");
        if (string3 != null) {
            this.f134191c = C2130mk.m62051c(this.f134191c, null, null, string3, null, null, null, null, null, null, null, false, 0, null, 8187);
        }
        d0n0 d0n0Var = (d0n0) bundle.getParcelable("default_control");
        if (d0n0Var != null) {
            this.f134191c = C2130mk.m62051c(this.f134191c, null, null, null, d0n0Var, null, null, null, null, null, null, false, 0, null, 8183);
        }
        m59203h(m59200e(abstractC2616yk), d850Var);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2616yk m59200e(AbstractC2616yk abstractC2616yk) {
        ArrayList arrayList = this.f134192d;
        AbstractC2616yk abstractC2616yk2 = (AbstractC2616yk) g6f.m43747t0(arrayList.indexOf(abstractC2616yk) + 1, arrayList);
        if (abstractC2616yk2 != null) {
            return abstractC2616yk2;
        }
        Logger.m3966b("No next step for %s (steps size=%d)", abstractC2616yk, Integer.valueOf(arrayList.size()));
        return abstractC2616yk;
    }

    /* JADX INFO: renamed from: f */
    public final voc1 m59201f(AbstractC2616yk abstractC2616yk) {
        return g9g1.m44040p(m59200e(abstractC2616yk), this.f134191c.f144452h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r4 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r4 == r9) goto L27;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m59202g(a370 a370Var, boolean z, xxm0 xxm0Var, ibk ibkVar) {
        C2055kk c2055kk;
        a5l a5lVar;
        a370 a370Var2 = a370Var;
        boolean z2 = z;
        xxm0 xxm0Var2 = xxm0Var;
        if (ibkVar instanceof C2055kk) {
            c2055kk = (C2055kk) ibkVar;
            int i = c2055kk.f123465f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2055kk.f123465f = i - Integer.MIN_VALUE;
            } else {
                c2055kk = new C2055kk(this, ibkVar);
            }
        } else {
            c2055kk = new C2055kk(this, ibkVar);
        }
        Object objM52329c = c2055kk.f123463d;
        int i2 = c2055kk.f123465f;
        if (i2 == 0) {
            bga.m29073P(objM52329c);
            m59197a();
            boolean z3 = a370Var2 instanceof z270;
            j470 j470Var = this.f134190b;
            yuk yukVar = yuk.f276404a;
            if (z3) {
                h891 h891Var = ((z270) a370Var2).f278507a;
                c2055kk.f123460a = a370Var2;
                c2055kk.f123461b = xxm0Var2;
                c2055kk.f123462c = z2;
                c2055kk.f123465f = 1;
                objM52329c = j470Var.m52330d(h891Var, c2055kk);
            } else {
                if (!(a370Var2 instanceof y270)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((y270) a370Var2).f268477a;
                c2055kk.f123460a = a370Var2;
                c2055kk.f123461b = xxm0Var2;
                c2055kk.f123462c = z2;
                c2055kk.f123465f = 2;
                objM52329c = j470Var.m52329c(str, c2055kk);
            }
            return yukVar;
        }
        if (i2 == 1) {
            boolean z4 = c2055kk.f123462c;
            xxm0 xxm0Var3 = c2055kk.f123461b;
            a370 a370Var3 = c2055kk.f123460a;
            bga.m29073P(objM52329c);
            z2 = z4;
            a370Var2 = a370Var3;
            xxm0Var2 = xxm0Var3;
            a5lVar = (a5l) objM52329c;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = c2055kk.f123462c;
            xxm0 xxm0Var4 = c2055kk.f123461b;
            a370 a370Var4 = c2055kk.f123460a;
            bga.m29073P(objM52329c);
            z2 = z5;
            a370Var2 = a370Var4;
            xxm0Var2 = xxm0Var4;
            a5lVar = (a5l) objM52329c;
        }
        a370 a370Var5 = a370Var2;
        xxm0 xxm0Var5 = xxm0Var2;
        int i3 = a5lVar.f12549e;
        lc2 lc2Var = a5lVar.f12546b;
        iwm0 iwm0Var = a5lVar.f12545a;
        if (i3 != 0) {
            return new lq40(i3, new Integer(lc2Var.f131803d));
        }
        C2130mk c2130mk = this.f134191c;
        d0n0 d0n0Var = a5lVar.f12547c;
        String str2 = lc2Var.f131800a;
        String str3 = lc2Var.f131801b;
        agr0 agr0Var = iwm0Var.f106483b;
        ArrayList arrayList = iwm0Var.f106485d;
        this.f134191c = C2130mk.m62051c(c2130mk, null, null, null, d0n0Var, str3, str2, agr0Var, a370Var5, arrayList, a5lVar.f12548d, a5lVar.f12550f, lc2Var.f131803d, xxm0Var5, 7);
        ArrayList arrayList2 = this.f134192d;
        if (z2) {
            arrayList2.add(C2575xk.f262251b);
        }
        if (xxm0Var5 != xxm0.ChildInitiatedSignup) {
            arrayList2.add(C2259pk.f178330b);
        }
        boolean z6 = a370Var5 instanceof z270;
        if (z6) {
            arrayList2.add(new C2461uk(((z270) a370Var5).f278507a));
        }
        if (iwm0Var.f106484c) {
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("At least one verification method must be provided if the age verification step is enabled.");
            }
            arrayList2.add(C2167nk.f154711b);
        }
        arrayList2.add(C2296qk.f189394b);
        if (this.f134191c.f144451g == agr0.f15483b) {
            arrayList2.add(C2217ok.f166194b);
        }
        if (iwm0Var.f106482a) {
            arrayList2.add(C2379sk.f209961b);
        }
        arrayList2.add(C2538wk.f252074b);
        arrayList2.add(C2341rk.f199931b);
        if (z6) {
            arrayList2.add(C2499vk.f242097b);
        } else {
            arrayList2.add(C2418tk.f221040b);
        }
        return mq40.f146156a;
    }

    /* JADX INFO: renamed from: h */
    public final void m59203h(AbstractC2616yk abstractC2616yk, d850 d850Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f134192d) {
            if (((AbstractC2616yk) obj).f273511a) {
                arrayList.add(obj);
            }
        }
        Bundle bundleM70529j = pp91.m70529j(new pqm0("key_flow_type", this.f134191c.f144452h), new pqm0("pages", new cpm0(arrayList.indexOf(abstractC2616yk) + 1, arrayList.size())));
        if (abstractC2616yk.equals(C2167nk.f154711b)) {
            bundleM70529j.putParcelableArrayList("verification_methods", new ArrayList<>(this.f134191c.f144453i));
            bundleM70529j.putInt("parental_consent_minimum_age", this.f134191c.f144443Y);
        } else if (abstractC2616yk instanceof C2461uk) {
            bundleM70529j.putParcelable("expected_account_type", this.f134191c.f144454t);
            bundleM70529j.putBoolean("has_addons_terminated_by_transition", this.f134191c.f144442X);
        } else if (abstractC2616yk.equals(C2296qk.f189394b)) {
            bundleM70529j.putParcelable("key_privacy_policy_consent_type", this.f134191c.f144451g);
            bundleM70529j.putParcelable("expected_account_type", this.f134191c.f144454t);
        } else if (abstractC2616yk.equals(C2379sk.f209961b)) {
            bundleM70529j.putString("pin", this.f134191c.f144445a);
        } else if (abstractC2616yk.equals(C2341rk.f199931b)) {
            bundleM70529j.putParcelable("default_control", this.f134191c.f144448d);
            bundleM70529j.putParcelable("expected_account_type", this.f134191c.f144454t);
        } else if (abstractC2616yk.equals(C2538wk.f252074b)) {
            bundleM70529j.putString("minBirthday", this.f134191c.f144450f);
            bundleM70529j.putString("maxBirthday", this.f134191c.f144449e);
        } else if (abstractC2616yk.equals(C2418tk.f221040b)) {
            bundleM70529j.putString("name", this.f134191c.f144446b);
            bundleM70529j.putString("pin", this.f134191c.f144445a);
            bundleM70529j.putString("birthday", this.f134191c.f144447c);
            bundleM70529j.putParcelable("parental_controls", this.f134191c.f144448d);
            bundleM70529j.putParcelable("expected_account_type", this.f134191c.f144454t);
        } else if (abstractC2616yk.equals(C2499vk.f242097b)) {
            bundleM70529j.putParcelable("flow_type", this.f134191c.f144452h);
            bundleM70529j.putString("kid_name", this.f134191c.f144446b);
            bundleM70529j.putString("kid_birthday", this.f134191c.f144447c);
            bundleM70529j.putString("pin", this.f134191c.f144445a);
            bundleM70529j.putParcelable("parental_controls", this.f134191c.f144448d);
            bundleM70529j.putString("source", this.f134191c.f144444Z.f267028a);
            bundleM70529j.putParcelable("expected_account_type", this.f134191c.f144454t);
        }
        String str = g9g1.m44040p(abstractC2616yk, this.f134191c.f144452h).f243453a;
        n6j0 n6j0Var = d850Var != null ? new n6j0(d850Var) : null;
        if (str == null) {
            throw new IllegalStateException("uri was not set!");
        }
        this.f134189a.mo47348i(new p6j0(str, "", false, false, 0, 0, false, null, null, n6j0Var), bundleM70529j);
    }

    /* JADX INFO: renamed from: i */
    public final void m59204i(h9y0 h9y0Var) {
        ArrayList parcelableArrayList;
        Bundle bundleM41108a = h9y0Var.mo34135x().m41108a("account_creation_flow_state");
        if (bundleM41108a != null) {
            ClassLoader classLoader = C2130mk.class.getClassLoader();
            if (classLoader == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bundleM41108a.setClassLoader(classLoader);
            C2130mk c2130mk = this.f134191c;
            C2130mk c2130mk2 = C2130mk.f144441L0;
            if (wj50.m88271j(c2130mk, c2130mk2)) {
                C2130mk c2130mk3 = (C2130mk) bundleM41108a.getParcelable("account_creation_flow_model");
                if (c2130mk3 != null) {
                    c2130mk2 = c2130mk3;
                }
                this.f134191c = c2130mk2;
            }
            ArrayList arrayList = this.f134192d;
            if (!arrayList.isEmpty() || (parcelableArrayList = bundleM41108a.getParcelableArrayList("account_creation_flow_steps")) == null) {
                return;
            }
            arrayList.addAll(parcelableArrayList);
        }
    }
}
