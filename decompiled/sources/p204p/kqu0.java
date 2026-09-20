package p204p;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class kqu0 implements yb70 {

    /* JADX INFO: renamed from: i */
    public static final boolean f125438i;

    /* JADX INFO: renamed from: t */
    public static final HashMap f125439t;

    /* JADX INFO: renamed from: a */
    public int[] f125440a;

    /* JADX INFO: renamed from: b */
    public String f125441b;

    /* JADX INFO: renamed from: c */
    public int f125442c;

    /* JADX INFO: renamed from: d */
    public String[] f125443d;

    /* JADX INFO: renamed from: e */
    public String[] f125444e;

    /* JADX INFO: renamed from: f */
    public String[] f125445f;

    /* JADX INFO: renamed from: g */
    public jb70 f125446g;

    /* JADX INFO: renamed from: h */
    public String[] f125447h;

    static {
        try {
            f125438i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f125438i = false;
        }
        HashMap map = new HashMap();
        f125439t = map;
        y400 y400Var = new y400("kotlin.jvm.internal.KotlinClass");
        map.put(new vfe(y400Var.m92786b(), y400Var.f269048a.m95306g()), jb70.CLASS);
        y400 y400Var2 = new y400("kotlin.jvm.internal.KotlinFileFacade");
        map.put(new vfe(y400Var2.m92786b(), y400Var2.f269048a.m95306g()), jb70.FILE_FACADE);
        y400 y400Var3 = new y400("kotlin.jvm.internal.KotlinMultifileClass");
        map.put(new vfe(y400Var3.m92786b(), y400Var3.f269048a.m95306g()), jb70.MULTIFILE_CLASS);
        y400 y400Var4 = new y400("kotlin.jvm.internal.KotlinMultifileClassPart");
        map.put(new vfe(y400Var4.m92786b(), y400Var4.f269048a.m95306g()), jb70.MULTIFILE_CLASS_PART);
        y400 y400Var5 = new y400("kotlin.jvm.internal.KotlinSyntheticClass");
        map.put(new vfe(y400Var5.m92786b(), y400Var5.f269048a.m95306g()), jb70.SYNTHETIC_CLASS);
    }

    @Override // p204p.yb70
    /* JADX INFO: renamed from: f */
    public final wb70 mo28663f(vfe vfeVar, aov0 aov0Var) {
        jb70 jb70Var;
        y400 y400VarM85354a = vfeVar.m85354a();
        if (y400VarM85354a.equals(fn60.f71195a)) {
            return new djs0(this, 8);
        }
        if (y400VarM85354a.equals(fn60.f71211q)) {
            return new p0p0(this, 17);
        }
        if (f125438i || this.f125446g != null || (jb70Var = (jb70) f125439t.get(vfeVar)) == null) {
            return null;
        }
        this.f125446g = jb70Var;
        return new gjs0(this, 9);
    }

    @Override // p204p.yb70
    /* JADX INFO: renamed from: c */
    public final void mo28660c() {
    }
}
