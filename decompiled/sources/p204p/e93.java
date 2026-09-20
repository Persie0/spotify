package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e93 extends hq20 {

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ int f57349n0;

    /* JADX INFO: renamed from: o0 */
    public float f57350o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e93(xu41 xu41Var, int i, int i2) {
        super(xu41Var, i);
        this.f57349n0 = i2;
    }

    @Override // p204p.hq20, p204p.v6j, p204p.ulv0, p204p.e6y
    public final void apply() {
        switch (this.f57349n0) {
            case 0:
                Iterator it = this.f94003m0.iterator();
                while (it.hasNext()) {
                    v6j v6jVarM92121b = this.f94001k0.m92121b(it.next());
                    v6jVarM92121b.m84804p();
                    Object obj = this.f237863N;
                    if (obj != null) {
                        v6jVarM92121b.m84783P(obj);
                    } else {
                        Object obj2 = this.f237864O;
                        if (obj2 != null) {
                            v6jVarM92121b.f237895j0 = 6;
                            v6jVarM92121b.f237864O = obj2;
                        } else {
                            v6jVarM92121b.m84783P(0);
                        }
                    }
                    Object obj3 = this.f237865P;
                    if (obj3 != null) {
                        v6jVarM92121b.f237895j0 = 7;
                        v6jVarM92121b.f237865P = obj3;
                    } else {
                        Object obj4 = this.f237866Q;
                        if (obj4 != null) {
                            v6jVarM92121b.m84806r(obj4);
                        } else {
                            v6jVarM92121b.m84806r(0);
                        }
                    }
                    float f = this.f57350o0;
                    if (f != 0.5f) {
                        v6jVarM92121b.f237890h = f;
                    }
                }
                break;
            default:
                Iterator it2 = this.f94003m0.iterator();
                while (it2.hasNext()) {
                    v6j v6jVarM92121b2 = this.f94001k0.m92121b(it2.next());
                    v6jVarM92121b2.m84805q();
                    Object obj5 = this.f237867R;
                    if (obj5 != null) {
                        v6jVarM92121b2.m84786S(obj5);
                    } else {
                        Object obj6 = this.f237868S;
                        if (obj6 != null) {
                            v6jVarM92121b2.m84785R(obj6);
                        } else {
                            v6jVarM92121b2.m84786S(0);
                        }
                    }
                    Object obj7 = this.f237870U;
                    if (obj7 != null) {
                        v6jVarM92121b2.m84801m(obj7);
                    } else {
                        Object obj8 = this.f237871V;
                        if (obj8 != null) {
                            v6jVarM92121b2.m84800l(obj8);
                        } else {
                            v6jVarM92121b2.m84800l(0);
                        }
                    }
                    float f2 = this.f57350o0;
                    if (f2 != 0.5f) {
                        v6jVarM92121b2.f237892i = f2;
                    }
                }
                break;
        }
    }
}
