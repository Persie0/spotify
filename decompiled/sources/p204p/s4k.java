package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface s4k {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m77200a(s4k s4kVar, String str, String str2, d850 d850Var, q4k q4kVar, int i) {
        q4k q4kVar2;
        String str3 = (i & 2) != 0 ? null : str2;
        if ((i & 8) != 0) {
            q4kVar2 = new q4k(null, false, false, false, false, false, false, null, false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741823);
        } else {
            q4kVar2 = q4kVar;
        }
        s4kVar.mo29767b(str, str3, d850Var, q4kVar2);
    }

    /* JADX INFO: renamed from: b */
    void mo29767b(String str, String str2, d850 d850Var, q4k q4kVar);
}
