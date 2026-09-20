package com.spotify.connectivity.httpretrofit;

import java.util.function.UnaryOperator;
import p204p.C2529wd;
import p204p.ccx0;
import p204p.fcx0;
import p204p.pd2;
import p204p.ph30;
import p204p.rth;
import p204p.y4l0;
import p204p.z4l0;

/* JADX INFO: loaded from: classes.dex */
public class RetrofitMaker {
    private final fcx0 mAssertion;
    private final ccx0 mRetrofitInternalWebgate;
    private final ccx0 mRetrofitWebgate;

    public RetrofitMaker(ccx0 ccx0Var, ccx0 ccx0Var2, fcx0 fcx0Var) {
        this.mRetrofitWebgate = ccx0Var;
        this.mAssertion = fcx0Var;
        this.mRetrofitInternalWebgate = ccx0Var2;
    }

    private static <T> T doCreateService(ccx0 ccx0Var, Class<T> cls, fcx0 fcx0Var) {
        return (T) ccx0Var.m32329b(cls);
    }

    private static <T> T doCreateServiceWithSourceIdentifier(ccx0 ccx0Var, Class<T> cls, fcx0 fcx0Var, String str) {
        y4l0 y4l0VarM95347a = ((z4l0) ccx0Var.f36658b).m95347a();
        y4l0VarM95347a.f269174c.add(new pd2(str, 1));
        z4l0 z4l0Var = new z4l0(y4l0VarM95347a);
        C2529wd c2529wd = new C2529wd(ccx0Var);
        c2529wd.f250160a = z4l0Var;
        return (T) doCreateService(c2529wd.m87802t(), cls, fcx0Var);
    }

    public <T> T createCustomHostService(Class<T> cls, ph30 ph30Var) {
        ccx0 ccx0Var = this.mRetrofitWebgate;
        ccx0Var.getClass();
        C2529wd c2529wd = new C2529wd(ccx0Var);
        c2529wd.m87801s(ph30Var);
        return (T) doCreateService(c2529wd.m87802t(), cls, this.mAssertion);
    }

    public <T> T createEarlyAccessWebgateService(Class<T> cls, String str) {
        ccx0 ccx0Var = this.mRetrofitInternalWebgate;
        return ccx0Var != null ? (T) doCreateServiceWithSourceIdentifier(ccx0Var, cls, this.mAssertion, str) : (T) createWebgateService(cls, str);
    }

    public <T> T createExperimentalWebgateService(Class<T> cls, String str) {
        rth rthVarM69943g = this.mRetrofitWebgate.f36659c.m69943g();
        rthVarM69943g.m76389j("exp.wg.spotify.com");
        return (T) createCustomHostService(cls, rthVarM69943g.m76382c(), str);
    }

    public <T> T createWebgateService(Class<T> cls, String str) {
        return (T) doCreateServiceWithSourceIdentifier(this.mRetrofitWebgate, cls, this.mAssertion, str);
    }

    public <T> T createWebgateService(Class<T> cls, String str, UnaryOperator<y4l0> unaryOperator) {
        y4l0 y4l0Var = (y4l0) unaryOperator.apply(((z4l0) this.mRetrofitWebgate.f36658b).m95347a());
        y4l0Var.f269174c.add(new pd2(str, 1));
        z4l0 z4l0Var = new z4l0(y4l0Var);
        ccx0 ccx0Var = this.mRetrofitWebgate;
        ccx0Var.getClass();
        C2529wd c2529wd = new C2529wd(ccx0Var);
        c2529wd.f250160a = z4l0Var;
        return (T) doCreateService(c2529wd.m87802t(), cls, this.mAssertion);
    }

    public <T> T createEarlyAccessWebgateService(Class<T> cls, String str, UnaryOperator<y4l0> unaryOperator) {
        ccx0 ccx0Var = this.mRetrofitInternalWebgate;
        if (ccx0Var != null) {
            y4l0 y4l0Var = (y4l0) unaryOperator.apply(((z4l0) ccx0Var.f36658b).m95347a());
            y4l0Var.f269174c.add(new pd2(str, 1));
            z4l0 z4l0Var = new z4l0(y4l0Var);
            ccx0 ccx0Var2 = this.mRetrofitInternalWebgate;
            ccx0Var2.getClass();
            C2529wd c2529wd = new C2529wd(ccx0Var2);
            c2529wd.f250160a = z4l0Var;
            return (T) doCreateService(c2529wd.m87802t(), cls, this.mAssertion);
        }
        return (T) createWebgateService(cls, str, unaryOperator);
    }

    public RetrofitMaker(ccx0 ccx0Var, fcx0 fcx0Var) {
        this.mRetrofitWebgate = ccx0Var;
        this.mAssertion = fcx0Var;
        this.mRetrofitInternalWebgate = null;
    }

    public <T> T createCustomHostService(Class<T> cls, ph30 ph30Var, String str) {
        ccx0 ccx0Var = this.mRetrofitWebgate;
        ccx0Var.getClass();
        C2529wd c2529wd = new C2529wd(ccx0Var);
        c2529wd.m87801s(ph30Var);
        return (T) doCreateServiceWithSourceIdentifier(c2529wd.m87802t(), cls, this.mAssertion, str);
    }
}
