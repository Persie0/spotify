package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n0j implements yyx0, jsi0 {

    /* JADX INFO: renamed from: a */
    public final yyx0 f149097a;

    /* JADX INFO: renamed from: b */
    public final lsi0 f149098b;

    /* JADX INFO: renamed from: c */
    public juk f149099c;

    /* JADX INFO: renamed from: d */
    public Throwable f149100d;

    /* JADX INFO: renamed from: e */
    public final m0j f149101e;

    public n0j(yyx0 yyx0Var) {
        lsi0 lsi0VarM62770a = msi0.m62770a();
        this.f149097a = yyx0Var;
        this.f149098b = lsi0VarM62770a;
        this.f149101e = new m0j(this);
    }

    @Override // p204p.yyx0
    /* JADX INFO: renamed from: G1 */
    public final ezx0 mo63454G1(String str) {
        m0j m0jVar = this.f149101e;
        if (m0jVar == null) {
            return this.f149097a.mo63454G1(str);
        }
        Object objM66541c = m0jVar.m66541c(str);
        wj50.m88279p(objM66541c);
        return new l0j((ezx0) objM66541c);
    }

    @Override // p204p.jsi0
    /* JADX INFO: renamed from: a */
    public final Object mo54248a(fbk fbkVar) {
        return this.f149098b.mo54248a(fbkVar);
    }

    @Override // p204p.jsi0
    /* JADX INFO: renamed from: c */
    public final void mo54249c(Object obj) {
        this.f149098b.mo54249c(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        m0j m0jVar = this.f149101e;
        if (m0jVar != null) {
            m0jVar.m66544f(-1);
        }
        this.f149097a.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m63455e(StringBuilder sb) {
        int i;
        if (this.f149099c == null && this.f149100d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            juk jukVar = this.f149099c;
            if (jukVar != null) {
                sb.append("\t\tCoroutine: " + jukVar);
                sb.append('\n');
            }
            Throwable th = this.f149100d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = g6f.m43729k0(wl51.m88465O0(y85.m93049F(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.f149101e != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            m0j m0jVar = this.f149101e;
            synchronized (m0jVar.f163290c) {
                i = m0jVar.f163291d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.f149097a.toString();
    }

    @Override // p204p.yyx0
    /* JADX INFO: renamed from: w */
    public final boolean mo63456w() {
        return this.f149097a.mo63456w();
    }
}
