package p204p;

/* JADX INFO: loaded from: classes2.dex */
public interface o9c {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m66459a(o9c o9cVar, String str, kaa0 kaa0Var, boolean z, boolean z2, String str2, String str3, String str4, ibk ibkVar, int i) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        return o9cVar.mo46378b(str, kaa0Var, z, z2, str2, str3, (i & 64) == 0, (i & 128) != 0 ? null : str4, ibkVar);
    }

    /* JADX INFO: renamed from: b */
    Object mo46378b(String str, kaa0 kaa0Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, ibk ibkVar);
}
