package p204p;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class hvf {

    /* JADX INFO: renamed from: a */
    public String f95697a = null;

    /* JADX INFO: renamed from: b */
    public final HashSet f95698b;

    /* JADX INFO: renamed from: c */
    public final HashSet f95699c;

    /* JADX INFO: renamed from: d */
    public int f95700d;

    /* JADX INFO: renamed from: e */
    public int f95701e;

    /* JADX INFO: renamed from: f */
    public rwf f95702f;

    /* JADX INFO: renamed from: g */
    public final HashSet f95703g;

    public hvf(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f95698b = hashSet;
        this.f95699c = new HashSet();
        this.f95700d = 0;
        this.f95701e = 0;
        this.f95703g = new HashSet();
        hashSet.add(eht0.m39004a(cls));
        for (Class cls2 : clsArr) {
            bga.m29092n(cls2, "Null interface");
            this.f95698b.add(eht0.m39004a(cls2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m48826a(btq btqVar) {
        if (this.f95698b.contains(btqVar.f30911a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f95699c.add(btqVar);
    }

    /* JADX INFO: renamed from: b */
    public final svf m48827b() {
        if (this.f95702f != null) {
            return new svf(this.f95697a, new HashSet(this.f95698b), new HashSet(this.f95699c), this.f95700d, this.f95701e, this.f95702f, this.f95703g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* JADX INFO: renamed from: c */
    public final void m48828c(int i) {
        if (!(this.f95700d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f95700d = i;
    }

    public hvf(eht0 eht0Var, eht0[] eht0VarArr) {
        HashSet hashSet = new HashSet();
        this.f95698b = hashSet;
        this.f95699c = new HashSet();
        this.f95700d = 0;
        this.f95701e = 0;
        this.f95703g = new HashSet();
        hashSet.add(eht0Var);
        for (eht0 eht0Var2 : eht0VarArr) {
            bga.m29092n(eht0Var2, "Null interface");
        }
        Collections.addAll(this.f95698b, eht0VarArr);
    }
}
