package p204p;

import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class ur60 implements kn91, do91, kq60 {

    /* JADX INFO: renamed from: a */
    public final Object f233239a;

    /* JADX INFO: renamed from: b */
    public final Object f233240b;

    /* JADX INFO: renamed from: c */
    public final String f233241c;

    /* JADX INFO: renamed from: d */
    public final int f233242d;

    /* JADX INFO: renamed from: e */
    public final bo91 f233243e;

    /* JADX INFO: renamed from: f */
    public volatile List f233244f;

    public ur60(bo91 bo91Var, vr60 vr60Var, String str, int i) {
        this.f233239a = vr60Var;
        this.f233240b = q3d0.m72078I(2, new ew40(this, 1));
        this.f233241c = str;
        this.f233242d = i;
        this.f233243e = bo91Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: b */
    public final GenericDeclaration m83833b() {
        return (GenericDeclaration) this.f233240b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final String m83834c() {
        return this.f233241c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ur60)) {
            return false;
        }
        ur60 ur60Var = (ur60) obj;
        return wj50.m88271j(this.f233241c, ur60Var.f233241c) && wj50.m88271j(this.f233239a, ur60Var.f233239a);
    }

    public final List getUpperBounds() {
        List list = this.f233244f;
        if (list != null) {
            return list;
        }
        wj50.m88260d0("upperBounds");
        throw null;
    }

    public final int hashCode() {
        return this.f233241c.hashCode() + (this.f233239a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM38547C = edb.m38547C(this.f233242d);
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                sb.append("in ");
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sb.append("out ");
            }
        }
        sb.append(this.f233241c);
        return sb.toString();
    }

    public ur60(vr60 vr60Var, bo91 bo91Var) {
        this(vr60Var, bo91Var, zr60.f285551b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ur60(vr60 vr60Var, bo91 bo91Var, zr60 zr60Var) {
        int i;
        String strM73844b = bo91Var.getName().m73844b();
        int iM38547C = edb.m38547C(bo91Var.mo27374C());
        if (iM38547C != 0) {
            i = 2;
            if (iM38547C != 1) {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 3;
            }
        } else {
            i = 1;
        }
        bo91Var.mo27373A();
        this(bo91Var, vr60Var, strM73844b, i);
        List<gd70> upperBounds = bo91Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(i6f.m49804T(upperBounds, 10));
        for (gd70 gd70Var : upperBounds) {
            wj50.m88279p(gd70Var);
            zwq zwqVar = new zwq(gd70Var);
            zr60 zr60Var2 = zr60.f285551b;
            sr60 sr60Var = zr60Var.m96756a(1, zwqVar).f265275b;
            if (sr60Var != null) {
                arrayList.add(sr60Var);
            } else {
                lay.m58584f(vr60Var);
                throw null;
            }
        }
        this.f233244f = arrayList;
    }
}
