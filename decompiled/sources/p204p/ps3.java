package p204p;

import android.app.Application;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ps3 {

    /* JADX INFO: renamed from: a */
    public final Object f180724a;

    /* JADX INFO: renamed from: b */
    public final Object f180725b;

    /* JADX INFO: renamed from: c */
    public final Object f180726c;

    /* JADX INFO: renamed from: d */
    public final Object f180727d;

    /* JADX INFO: renamed from: e */
    public final Object f180728e;

    /* JADX INFO: renamed from: f */
    public final Object f180729f;

    /* JADX INFO: renamed from: g */
    public final Object f180730g;

    /* JADX INFO: renamed from: h */
    public final Object f180731h;

    /* JADX INFO: renamed from: i */
    public final Object f180732i;

    /* JADX INFO: renamed from: j */
    public final Object f180733j;

    /* JADX INFO: renamed from: k */
    public final Object f180734k;

    public ps3(Application application, okj0 okj0Var, mqw0 mqw0Var, a1e1 a1e1Var, cmg1 cmg1Var, d1e1 d1e1Var, w7g1 w7g1Var, f7d1 f7d1Var, uoa uoaVar, x4b x4bVar, qcg1 qcg1Var, sef0 sef0Var) {
        this.f180724a = application;
        this.f180734k = okj0Var;
        this.f180725b = mqw0Var;
        this.f180726c = cmg1Var;
        this.f180727d = d1e1Var;
        this.f180733j = w7g1Var;
        this.f180728e = f7d1Var;
        this.f180729f = uoaVar;
        this.f180730g = x4bVar;
        this.f180731h = qcg1Var;
        this.f180732i = sef0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public Object m70750a(xqi0 xqi0Var, ju0 ju0Var, ibk ibkVar) {
        ds3 ds3Var;
        uum0 uum0Var = (uum0) this.f180732i;
        gh00 gh00Var = (gh00) this.f180726c;
        if (ibkVar instanceof ds3) {
            ds3Var = (ds3) ibkVar;
            int i = ds3Var.f52479c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ds3Var.f52479c = i - Integer.MIN_VALUE;
            } else {
                ds3Var = new ds3(this, ibkVar);
            }
        } else {
            ds3Var = new ds3(this, ibkVar);
        }
        Object obj = ds3Var.f52477a;
        int i2 = ds3Var.f52479c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                dh50 dh50Var = (dh50) this.f180727d;
                fs3 fs3Var = new fs3(this, ju0Var, null, 0);
                ds3Var.f52479c = 1;
                Object objM35993a = dh50Var.m35993a(xqi0Var, fs3Var, ds3Var);
                yuk yukVar = yuk.f276404a;
                if (objM35993a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            Object objM78029a = m70752c().m78029a(uum0Var.m84031v());
            if (objM78029a != null && Math.abs(uum0Var.m84031v() - m70752c().m78031c(objM78029a)) <= 0.5f && ((Boolean) gh00Var.invoke(objM78029a)).booleanValue()) {
                m70753d(objM78029a);
            }
            return w2a1.f247311a;
        } catch (Throwable th) {
            Object objM78029a2 = m70752c().m78029a(uum0Var.m84031v());
            if (objM78029a2 != null && Math.abs(uum0Var.m84031v() - m70752c().m78031c(objM78029a2)) <= 0.5f && ((Boolean) gh00Var.invoke(objM78029a2)).booleanValue()) {
                m70753d(objM78029a2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public Observable m70751b(gh00 gh00Var) {
        return Observable.merge(g6f.m43728j1((ArrayList) this.f180733j)).scan(kkc0.m56706s0((LinkedHashMap) this.f180734k), fby.f67947t).distinctUntilChanged().map(lby.f131777t).map(new ha80(gh00Var));
    }

    /* JADX INFO: renamed from: c */
    public sgc0 m70752c() {
        return (sgc0) ((yum0) this.f180730g).getValue();
    }

    /* JADX INFO: renamed from: d */
    public void m70753d(Object obj) {
        ((yum0) this.f180728e).setValue(obj);
    }

    /* JADX INFO: renamed from: e */
    public void m70754e() {
        ArrayList arrayList = (ArrayList) this.f180733j;
        arrayList.add(((Observable) ((nob) this.f180728e).invoke()).map(qby.f187211t));
        arrayList.add(((Observable) ((tfm) this.f180725b).invoke()).map(wby.f249906i));
        arrayList.add(((Observable) ((wg61) ((guh0) this.f180724a).f84482f).getValue()).map(ddy.f47912t));
        arrayList.add(((Observable) ((ni00) this.f180730g).invoke()).map(tky.f221253X));
        arrayList.add(((Observable) ((qok0) this.f180729f).invoke()).map(ily.f103549i));
        arrayList.add(((Observable) ((qok0) this.f180726c).invoke()).map(mly.f144975t));
        arrayList.add(((Observable) ((nob) this.f180731h).invoke()).map(hsy.f94856t));
        arrayList.add(((Observable) ((nob) this.f180727d).invoke()).map(yby.f271314t));
        arrayList.add(((Observable) ((ni00) this.f180732i).invoke()).map(jey.f111731Y));
    }

    /* JADX INFO: renamed from: f */
    public tjg1 m70755f(String str, dlr0 dlr0Var) {
        return wj50.m88271j(dlr0Var, dlr0.f50335Z0) ? new ajg1(m70756g(str)) : new rig1((okj0) this.f180734k, m70756g(str));
    }

    /* JADX INFO: renamed from: g */
    public be41 m70756g(String str) {
        c4d1 c4d1Var = new c4d1(15);
        Application application = (Application) this.f180724a;
        okj0 okj0Var = (okj0) this.f180734k;
        hsb1 hsb1Var = new hsb1(str, okj0Var, (sef0) this.f180732i, c4d1Var, application);
        return new be41(new a531((qcg1) this.f180731h, (uoa) this.f180729f, okj0Var, hsb1Var), new g7d1((f7d1) this.f180728e, (x4b) this.f180730g, new x4b(hsb1Var, okj0Var, application), 11), (mqw0) this.f180725b);
    }

    public ps3(guh0 guh0Var, tfm tfmVar, qok0 qok0Var, nob nobVar, nob nobVar2, qok0 qok0Var2, ni00 ni00Var, nob nobVar3, ni00 ni00Var2) {
        this.f180724a = guh0Var;
        this.f180725b = tfmVar;
        this.f180726c = qok0Var;
        this.f180727d = nobVar;
        this.f180728e = nobVar2;
        this.f180729f = qok0Var2;
        this.f180730g = ni00Var;
        this.f180731h = nobVar3;
        this.f180732i = ni00Var2;
        this.f180733j = new ArrayList();
        this.f180734k = new LinkedHashMap();
    }

    public ps3(rgs rgsVar, C2245p6 c2245p6, mo4 mo4Var, n05 n05Var, gh00 gh00Var) {
        this.f180724a = c2245p6;
        this.f180725b = mo4Var;
        this.f180726c = gh00Var;
        this.f180727d = new dh50();
        new os3(this);
        this.f180728e = sam.m77645B(rgsVar);
        final int i = 0;
        sam.m77674m(new eh00(this) { // from class: p.zr3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ps3 f285530b;

            {
                this.f285530b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0063  */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
            
                if (r1 < java.lang.Math.abs(java.lang.Math.abs(((java.lang.Number) r3.invoke(java.lang.Float.valueOf(java.lang.Math.abs(r4.m78031c(r0) - r5)))).floatValue()) + r5)) goto L69;
             */
            @Override // p204p.eh00
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                Object objM78030b;
                float fM84031v;
                switch (i) {
                    case 0:
                        ps3 ps3Var = this.f285530b;
                        yum0 yum0Var = (yum0) ps3Var.f180729f;
                        yum0 yum0Var2 = (yum0) ps3Var.f180728e;
                        Object value = yum0Var.getValue();
                        if (value != null) {
                            return value;
                        }
                        float fM84031v2 = ((uum0) ps3Var.f180732i).m84031v();
                        if (Float.isNaN(fM84031v2)) {
                            return yum0Var2.getValue();
                        }
                        Object value2 = yum0Var2.getValue();
                        C2245p6 c2245p7 = (C2245p6) ps3Var.f180724a;
                        sgc0 sgc0VarM70752c = ps3Var.m70752c();
                        float fM78031c = sgc0VarM70752c.m78031c(value2);
                        float fFloatValue = ((Number) ((mo4) ps3Var.f180725b).invoke()).floatValue();
                        if (fM78031c != fM84031v2 && !Float.isNaN(fM78031c)) {
                            if (fM78031c < fM84031v2) {
                                if (0.0f < fFloatValue) {
                                    objM78030b = sgc0VarM70752c.m78030b(fM84031v2, true);
                                    wj50.m88279p(objM78030b);
                                    break;
                                } else {
                                    objM78030b = sgc0VarM70752c.m78030b(fM84031v2, true);
                                    wj50.m88279p(objM78030b);
                                }
                                return objM78030b;
                            }
                            if (0.0f > (-fFloatValue)) {
                                objM78030b = sgc0VarM70752c.m78030b(fM84031v2, false);
                                wj50.m88279p(objM78030b);
                                float fAbs = Math.abs(fM78031c - Math.abs(((Number) c2245p7.invoke(Float.valueOf(Math.abs(fM78031c - sgc0VarM70752c.m78031c(objM78030b))))).floatValue()));
                                if (fM84031v2 < 0.0f) {
                                }
                                break;
                            } else {
                                objM78030b = sgc0VarM70752c.m78030b(fM84031v2, false);
                                wj50.m88279p(objM78030b);
                            }
                            return objM78030b;
                        }
                        return value2;
                    case 1:
                        ps3 ps3Var2 = this.f285530b;
                        yum0 yum0Var3 = (yum0) ps3Var2.f180729f;
                        yum0 yum0Var4 = (yum0) ps3Var2.f180728e;
                        Object value3 = yum0Var3.getValue();
                        if (value3 != null) {
                            return value3;
                        }
                        float fM84031v3 = ((uum0) ps3Var2.f180732i).m84031v();
                        if (Float.isNaN(fM84031v3)) {
                            return yum0Var4.getValue();
                        }
                        Object value4 = yum0Var4.getValue();
                        sgc0 sgc0VarM70752c2 = ps3Var2.m70752c();
                        float fM78031c2 = sgc0VarM70752c2.m78031c(value4);
                        if (fM78031c2 != fM84031v3 && !Float.isNaN(fM78031c2)) {
                            if (fM78031c2 < fM84031v3) {
                                Object objM78030b2 = sgc0VarM70752c2.m78030b(fM84031v3, true);
                                if (objM78030b2 != null) {
                                    return objM78030b2;
                                }
                            } else {
                                Object objM78030b3 = sgc0VarM70752c2.m78030b(fM84031v3, false);
                                if (objM78030b3 != null) {
                                    return objM78030b3;
                                }
                            }
                        }
                        return value4;
                    default:
                        ps3 ps3Var3 = this.f285530b;
                        float fM78031c3 = ps3Var3.m70752c().m78031c(((yum0) ps3Var3.f180728e).getValue());
                        float fM78031c4 = ps3Var3.m70752c().m78031c(((rtq) ps3Var3.f180731h).getValue()) - fM78031c3;
                        float fAbs2 = Math.abs(fM78031c4);
                        if (Float.isNaN(fAbs2) || fAbs2 <= 1.0E-6f) {
                            fM84031v = 1.0f;
                        } else {
                            uum0 uum0Var = (uum0) ps3Var3.f180732i;
                            if (Float.isNaN(uum0Var.m84031v())) {
                                throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                            }
                            fM84031v = (uum0Var.m84031v() - fM78031c3) / fM78031c4;
                            if (fM84031v < 1.0E-6f) {
                                fM84031v = 0.0f;
                            } else if (fM84031v > 0.999999f) {
                                fM84031v = 1.0f;
                            }
                        }
                        return Float.valueOf(fM84031v);
                }
            }
        });
        final int i2 = 1;
        this.f180731h = sam.m77674m(new eh00(this) { // from class: p.zr3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ps3 f285530b;

            {
                this.f285530b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0063  */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
            
                if (r1 < java.lang.Math.abs(java.lang.Math.abs(((java.lang.Number) r3.invoke(java.lang.Float.valueOf(java.lang.Math.abs(r4.m78031c(r0) - r5)))).floatValue()) + r5)) goto L69;
             */
            @Override // p204p.eh00
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                Object objM78030b;
                float fM84031v;
                switch (i2) {
                    case 0:
                        ps3 ps3Var = this.f285530b;
                        yum0 yum0Var = (yum0) ps3Var.f180729f;
                        yum0 yum0Var2 = (yum0) ps3Var.f180728e;
                        Object value = yum0Var.getValue();
                        if (value != null) {
                            return value;
                        }
                        float fM84031v2 = ((uum0) ps3Var.f180732i).m84031v();
                        if (Float.isNaN(fM84031v2)) {
                            return yum0Var2.getValue();
                        }
                        Object value2 = yum0Var2.getValue();
                        C2245p6 c2245p7 = (C2245p6) ps3Var.f180724a;
                        sgc0 sgc0VarM70752c = ps3Var.m70752c();
                        float fM78031c = sgc0VarM70752c.m78031c(value2);
                        float fFloatValue = ((Number) ((mo4) ps3Var.f180725b).invoke()).floatValue();
                        if (fM78031c != fM84031v2 && !Float.isNaN(fM78031c)) {
                            if (fM78031c < fM84031v2) {
                                if (0.0f < fFloatValue) {
                                    objM78030b = sgc0VarM70752c.m78030b(fM84031v2, true);
                                    wj50.m88279p(objM78030b);
                                    break;
                                } else {
                                    objM78030b = sgc0VarM70752c.m78030b(fM84031v2, true);
                                    wj50.m88279p(objM78030b);
                                }
                                return objM78030b;
                            }
                            if (0.0f > (-fFloatValue)) {
                                objM78030b = sgc0VarM70752c.m78030b(fM84031v2, false);
                                wj50.m88279p(objM78030b);
                                float fAbs = Math.abs(fM78031c - Math.abs(((Number) c2245p7.invoke(Float.valueOf(Math.abs(fM78031c - sgc0VarM70752c.m78031c(objM78030b))))).floatValue()));
                                if (fM84031v2 < 0.0f) {
                                }
                                break;
                            } else {
                                objM78030b = sgc0VarM70752c.m78030b(fM84031v2, false);
                                wj50.m88279p(objM78030b);
                            }
                            return objM78030b;
                        }
                        return value2;
                    case 1:
                        ps3 ps3Var2 = this.f285530b;
                        yum0 yum0Var3 = (yum0) ps3Var2.f180729f;
                        yum0 yum0Var4 = (yum0) ps3Var2.f180728e;
                        Object value3 = yum0Var3.getValue();
                        if (value3 != null) {
                            return value3;
                        }
                        float fM84031v3 = ((uum0) ps3Var2.f180732i).m84031v();
                        if (Float.isNaN(fM84031v3)) {
                            return yum0Var4.getValue();
                        }
                        Object value4 = yum0Var4.getValue();
                        sgc0 sgc0VarM70752c2 = ps3Var2.m70752c();
                        float fM78031c2 = sgc0VarM70752c2.m78031c(value4);
                        if (fM78031c2 != fM84031v3 && !Float.isNaN(fM78031c2)) {
                            if (fM78031c2 < fM84031v3) {
                                Object objM78030b2 = sgc0VarM70752c2.m78030b(fM84031v3, true);
                                if (objM78030b2 != null) {
                                    return objM78030b2;
                                }
                            } else {
                                Object objM78030b3 = sgc0VarM70752c2.m78030b(fM84031v3, false);
                                if (objM78030b3 != null) {
                                    return objM78030b3;
                                }
                            }
                        }
                        return value4;
                    default:
                        ps3 ps3Var3 = this.f285530b;
                        float fM78031c3 = ps3Var3.m70752c().m78031c(((yum0) ps3Var3.f180728e).getValue());
                        float fM78031c4 = ps3Var3.m70752c().m78031c(((rtq) ps3Var3.f180731h).getValue()) - fM78031c3;
                        float fAbs2 = Math.abs(fM78031c4);
                        if (Float.isNaN(fAbs2) || fAbs2 <= 1.0E-6f) {
                            fM84031v = 1.0f;
                        } else {
                            uum0 uum0Var = (uum0) ps3Var3.f180732i;
                            if (Float.isNaN(uum0Var.m84031v())) {
                                throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                            }
                            fM84031v = (uum0Var.m84031v() - fM78031c3) / fM78031c4;
                            if (fM84031v < 1.0E-6f) {
                                fM84031v = 0.0f;
                            } else if (fM84031v > 0.999999f) {
                                fM84031v = 1.0f;
                            }
                        }
                        return Float.valueOf(fM84031v);
                }
            }
        });
        this.f180732i = stf1.m79253m(Float.NaN);
        final int i3 = 2;
        sam.m77675n(new eh00(this) { // from class: p.zr3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ps3 f285530b;

            {
                this.f285530b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0063  */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
            
                if (r1 < java.lang.Math.abs(java.lang.Math.abs(((java.lang.Number) r3.invoke(java.lang.Float.valueOf(java.lang.Math.abs(r4.m78031c(r0) - r5)))).floatValue()) + r5)) goto L69;
             */
            @Override // p204p.eh00
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                Object objM78030b;
                float fM84031v;
                switch (i3) {
                    case 0:
                        ps3 ps3Var = this.f285530b;
                        yum0 yum0Var = (yum0) ps3Var.f180729f;
                        yum0 yum0Var2 = (yum0) ps3Var.f180728e;
                        Object value = yum0Var.getValue();
                        if (value != null) {
                            return value;
                        }
                        float fM84031v2 = ((uum0) ps3Var.f180732i).m84031v();
                        if (Float.isNaN(fM84031v2)) {
                            return yum0Var2.getValue();
                        }
                        Object value2 = yum0Var2.getValue();
                        C2245p6 c2245p7 = (C2245p6) ps3Var.f180724a;
                        sgc0 sgc0VarM70752c = ps3Var.m70752c();
                        float fM78031c = sgc0VarM70752c.m78031c(value2);
                        float fFloatValue = ((Number) ((mo4) ps3Var.f180725b).invoke()).floatValue();
                        if (fM78031c != fM84031v2 && !Float.isNaN(fM78031c)) {
                            if (fM78031c < fM84031v2) {
                                if (0.0f < fFloatValue) {
                                    objM78030b = sgc0VarM70752c.m78030b(fM84031v2, true);
                                    wj50.m88279p(objM78030b);
                                    break;
                                } else {
                                    objM78030b = sgc0VarM70752c.m78030b(fM84031v2, true);
                                    wj50.m88279p(objM78030b);
                                }
                                return objM78030b;
                            }
                            if (0.0f > (-fFloatValue)) {
                                objM78030b = sgc0VarM70752c.m78030b(fM84031v2, false);
                                wj50.m88279p(objM78030b);
                                float fAbs = Math.abs(fM78031c - Math.abs(((Number) c2245p7.invoke(Float.valueOf(Math.abs(fM78031c - sgc0VarM70752c.m78031c(objM78030b))))).floatValue()));
                                if (fM84031v2 < 0.0f) {
                                }
                                break;
                            } else {
                                objM78030b = sgc0VarM70752c.m78030b(fM84031v2, false);
                                wj50.m88279p(objM78030b);
                            }
                            return objM78030b;
                        }
                        return value2;
                    case 1:
                        ps3 ps3Var2 = this.f285530b;
                        yum0 yum0Var3 = (yum0) ps3Var2.f180729f;
                        yum0 yum0Var4 = (yum0) ps3Var2.f180728e;
                        Object value3 = yum0Var3.getValue();
                        if (value3 != null) {
                            return value3;
                        }
                        float fM84031v3 = ((uum0) ps3Var2.f180732i).m84031v();
                        if (Float.isNaN(fM84031v3)) {
                            return yum0Var4.getValue();
                        }
                        Object value4 = yum0Var4.getValue();
                        sgc0 sgc0VarM70752c2 = ps3Var2.m70752c();
                        float fM78031c2 = sgc0VarM70752c2.m78031c(value4);
                        if (fM78031c2 != fM84031v3 && !Float.isNaN(fM78031c2)) {
                            if (fM78031c2 < fM84031v3) {
                                Object objM78030b2 = sgc0VarM70752c2.m78030b(fM84031v3, true);
                                if (objM78030b2 != null) {
                                    return objM78030b2;
                                }
                            } else {
                                Object objM78030b3 = sgc0VarM70752c2.m78030b(fM84031v3, false);
                                if (objM78030b3 != null) {
                                    return objM78030b3;
                                }
                            }
                        }
                        return value4;
                    default:
                        ps3 ps3Var3 = this.f285530b;
                        float fM78031c3 = ps3Var3.m70752c().m78031c(((yum0) ps3Var3.f180728e).getValue());
                        float fM78031c4 = ps3Var3.m70752c().m78031c(((rtq) ps3Var3.f180731h).getValue()) - fM78031c3;
                        float fAbs2 = Math.abs(fM78031c4);
                        if (Float.isNaN(fAbs2) || fAbs2 <= 1.0E-6f) {
                            fM84031v = 1.0f;
                        } else {
                            uum0 uum0Var = (uum0) ps3Var3.f180732i;
                            if (Float.isNaN(uum0Var.m84031v())) {
                                throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                            }
                            fM84031v = (uum0Var.m84031v() - fM78031c3) / fM78031c4;
                            if (fM84031v < 1.0E-6f) {
                                fM84031v = 0.0f;
                            } else if (fM84031v > 0.999999f) {
                                fM84031v = 1.0f;
                            }
                        }
                        return Float.valueOf(fM84031v);
                }
            }
        }, tjr0.f220989Q0);
        this.f180733j = stf1.m79253m(0.0f);
        this.f180729f = sam.m77645B(null);
        this.f180730g = sam.m77645B(hxh.m49016c());
        this.f180734k = new ks3(this);
    }
}
