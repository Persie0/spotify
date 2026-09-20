package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mzi {

    /* JADX INFO: renamed from: a */
    public boolean f148716a = true;

    /* JADX INFO: renamed from: b */
    public boolean f148717b;

    /* JADX INFO: renamed from: c */
    public Object f148718c;

    /* JADX INFO: renamed from: d */
    public Serializable f148719d;

    /* JADX INFO: renamed from: a */
    public nzi m63249a() {
        return new nzi(this.f148716a, this.f148717b, (String[]) this.f148718c, (String[]) this.f148719d);
    }

    /* JADX INFO: renamed from: b */
    public void m63250b(pde... pdeVarArr) {
        if (!this.f148716a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(pdeVarArr.length);
        for (pde pdeVar : pdeVarArr) {
            arrayList.add(pdeVar.f176445a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f148716a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr2.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f148718c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: c */
    public void m63251c(gx71... gx71VarArr) {
        if (!this.f148716a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(gx71VarArr.length);
        for (gx71 gx71Var : gx71VarArr) {
            arrayList.add(gx71Var.f85216a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f148716a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr2.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f148719d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }
}
