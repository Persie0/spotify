package p204p;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e3b implements uio {

    /* JADX INFO: renamed from: L0 */
    public long f55713L0;

    /* JADX INFO: renamed from: M0 */
    public long f55714M0;

    /* JADX INFO: renamed from: N0 */
    public pb21 f55715N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f55716O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f55717P0;

    /* JADX INFO: renamed from: Q0 */
    public long f55718Q0;

    /* JADX INFO: renamed from: X */
    public sjo f55719X;

    /* JADX INFO: renamed from: Y */
    public uio f55720Y;

    /* JADX INFO: renamed from: Z */
    public long f55721Z;

    /* JADX INFO: renamed from: a */
    public final w2b f55722a;

    /* JADX INFO: renamed from: b */
    public final uio f55723b;

    /* JADX INFO: renamed from: c */
    public final zx61 f55724c;

    /* JADX INFO: renamed from: d */
    public final uio f55725d;

    /* JADX INFO: renamed from: e */
    public final v3b f55726e;

    /* JADX INFO: renamed from: f */
    public final boolean f55727f;

    /* JADX INFO: renamed from: g */
    public final boolean f55728g;

    /* JADX INFO: renamed from: h */
    public final boolean f55729h;

    /* JADX INFO: renamed from: i */
    public Uri f55730i;

    /* JADX INFO: renamed from: t */
    public sjo f55731t;

    public e3b(w2b w2bVar, uio uioVar, uio uioVar2, c3b c3bVar, v3b v3bVar, int i) {
        this.f55722a = w2bVar;
        this.f55723b = uioVar2;
        this.f55726e = v3bVar;
        this.f55727f = (i & 1) != 0;
        this.f55728g = false;
        this.f55729h = false;
        if (uioVar != null) {
            this.f55725d = uioVar;
            this.f55724c = c3bVar != null ? new zx61(uioVar, c3bVar) : null;
        } else {
            this.f55725d = p6o0.f174445a;
            this.f55724c = null;
        }
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: a */
    public final void mo29278a(x491 x491Var) {
        x491Var.getClass();
        this.f55723b.mo29278a(x491Var);
        this.f55725d.mo29278a(x491Var);
    }

    @Override // p204p.uio
    public final void close() {
        this.f55731t = null;
        this.f55730i = null;
        this.f55713L0 = 0L;
        try {
            m37622d();
        } catch (Throwable th) {
            if (this.f55720Y == this.f55723b || (th instanceof Cache$CacheException)) {
                this.f55716O0 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m37622d() {
        w2b w2bVar = this.f55722a;
        uio uioVar = this.f55720Y;
        if (uioVar == null) {
            return;
        }
        try {
            uioVar.close();
        } finally {
            this.f55719X = null;
            this.f55720Y = null;
            pb21 pb21Var = this.f55715N0;
            if (pb21Var != null) {
                ((ob21) w2bVar).m66596k(pb21Var);
                this.f55715N0 = null;
            }
        }
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: e */
    public final Map mo28172e() {
        return !(this.f55720Y == this.f55723b) ? this.f55725d.mo28172e() : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: f */
    public final void m37623f(sjo sjoVar, boolean z) throws InterruptedIOException {
        pb21 pb21VarM66600o;
        long j;
        sjo sjoVarM75643a;
        uio uioVar;
        String str = sjoVar.f209892h;
        String str2 = h0b1.f86200a;
        if (this.f55717P0) {
            pb21VarM66600o = null;
        } else if (this.f55727f) {
            try {
                w2b w2bVar = this.f55722a;
                long j2 = this.f55713L0;
                long j3 = this.f55714M0;
                ob21 ob21Var = (ob21) w2bVar;
                synchronized (ob21Var) {
                    c95.m31855u(!ob21Var.f163524i);
                    ob21Var.m66591d();
                    while (true) {
                        pb21VarM66600o = ob21Var.m66600o(j2, str, j3);
                        if (pb21VarM66600o != null) {
                            break;
                        } else {
                            ob21Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            pb21VarM66600o = ((ob21) this.f55722a).m66600o(this.f55713L0, str, this.f55714M0);
        }
        if (pb21VarM66600o == null) {
            uioVar = this.f55725d;
            rjo rjoVarM78348a = sjoVar.m78348a();
            rjoVarM78348a.f199871f = this.f55713L0;
            rjoVarM78348a.f199872g = this.f55714M0;
            sjoVarM75643a = rjoVarM78348a.m75643a();
            j = -1;
        } else if (pb21VarM66600o.f108646d) {
            Uri uriFromFile = Uri.fromFile(pb21VarM66600o.f108647e);
            long j4 = pb21VarM66600o.f108644b;
            long j5 = this.f55713L0 - j4;
            long jMin = pb21VarM66600o.f108645c - j5;
            j = -1;
            long j6 = this.f55714M0;
            if (j6 != -1) {
                jMin = Math.min(jMin, j6);
            }
            rjo rjoVarM78348a2 = sjoVar.m78348a();
            rjoVarM78348a2.f199866a = uriFromFile;
            rjoVarM78348a2.f199867b = j4;
            rjoVarM78348a2.f199871f = j5;
            rjoVarM78348a2.f199872g = jMin;
            sjoVarM75643a = rjoVarM78348a2.m75643a();
            uioVar = this.f55723b;
        } else {
            j = -1;
            long jMin2 = pb21VarM66600o.f108645c;
            if (jMin2 == -1) {
                jMin2 = this.f55714M0;
            } else {
                long j7 = this.f55714M0;
                if (j7 != -1) {
                    jMin2 = Math.min(jMin2, j7);
                }
            }
            rjo rjoVarM78348a3 = sjoVar.m78348a();
            rjoVarM78348a3.f199871f = this.f55713L0;
            rjoVarM78348a3.f199872g = jMin2;
            sjoVarM75643a = rjoVarM78348a3.m75643a();
            uioVar = this.f55724c;
            if (uioVar == null) {
                uioVar = this.f55725d;
                ((ob21) this.f55722a).m66596k(pb21VarM66600o);
                pb21VarM66600o = null;
            }
        }
        this.f55718Q0 = (this.f55717P0 || uioVar != this.f55725d) ? Long.MAX_VALUE : this.f55713L0 + 102400;
        if (z) {
            c95.m31855u(this.f55720Y == this.f55725d);
            if (uioVar == this.f55725d) {
                return;
            }
            try {
                m37622d();
            } catch (Throwable th) {
                if (!pb21VarM66600o.f108646d) {
                    ((ob21) this.f55722a).m66596k(pb21VarM66600o);
                }
                throw th;
            }
        }
        if (pb21VarM66600o != null && !pb21VarM66600o.f108646d) {
            this.f55715N0 = pb21VarM66600o;
        }
        this.f55720Y = uioVar;
        this.f55719X = sjoVarM75643a;
        this.f55721Z = 0L;
        long jMo28175u = uioVar.mo28175u(sjoVarM75643a);
        n6i n6iVar = new n6i();
        if (sjoVarM75643a.f209891g == j && jMo28175u != j) {
            this.f55714M0 = jMo28175u;
            n6iVar.m63774d(Long.valueOf(this.f55713L0 + jMo28175u), "exo_len");
        }
        if (!(this.f55720Y == this.f55723b)) {
            Uri uri = uioVar.getUri();
            this.f55730i = uri;
            Uri uri2 = sjoVar.f209885a.equals(uri) ? null : this.f55730i;
            if (uri2 == null) {
                ((ArrayList) n6iVar.f150892c).add("exo_redir");
                ((HashMap) n6iVar.f150891b).remove("exo_redir");
            } else {
                n6iVar.m63774d(uri2.toString(), "exo_redir");
            }
        }
        if (this.f55720Y == this.f55724c) {
            ((ob21) this.f55722a).m66590c(str, n6iVar);
        }
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f55730i;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        uio uioVar = this.f55723b;
        if (i2 == 0) {
            return 0;
        }
        if (this.f55714M0 == 0) {
            return -1;
        }
        sjo sjoVar = this.f55731t;
        sjoVar.getClass();
        sjo sjoVar2 = this.f55719X;
        sjoVar2.getClass();
        try {
            if (this.f55713L0 >= this.f55718Q0) {
                m37623f(sjoVar, true);
            }
            uio uioVar2 = this.f55720Y;
            uioVar2.getClass();
            int i4 = uioVar2.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = i4;
                this.f55713L0 += j2;
                this.f55721Z += j2;
                long j3 = this.f55714M0;
                if (j3 == -1) {
                    return i4;
                }
                this.f55714M0 = j3 - j2;
                return i4;
            }
            uio uioVar3 = this.f55720Y;
            if (!(uioVar3 == uioVar)) {
                j = -1;
                long j4 = sjoVar2.f209891g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.f55721Z < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = sjoVar.f209892h;
                String str2 = h0b1.f86200a;
                this.f55714M0 = 0L;
                if (!(uioVar3 == this.f55724c)) {
                    return i3;
                }
                n6i n6iVar = new n6i();
                n6iVar.m63774d(Long.valueOf(this.f55713L0), "exo_len");
                ((ob21) this.f55722a).m66590c(str, n6iVar);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.f55714M0;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            m37622d();
            m37623f(sjoVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.f55720Y == uioVar || (th instanceof Cache$CacheException)) {
                this.f55716O0 = true;
            }
            throw th;
        }
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) {
        w2b w2bVar = this.f55722a;
        try {
            String strMo60230c = this.f55726e.mo60230c(sjoVar);
            rjo rjoVarM78348a = sjoVar.m78348a();
            long j = sjoVar.f209890f;
            long j2 = sjoVar.f209891g;
            rjoVarM78348a.f199873h = strMo60230c;
            sjo sjoVarM75643a = rjoVarM78348a.m75643a();
            this.f55731t = sjoVarM75643a;
            Uri uri = sjoVarM75643a.f209885a;
            byte[] bArr = (byte[]) ((ob21) w2bVar).m66594i(strMo60230c).f196825b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f55730i = uri;
            this.f55713L0 = j;
            boolean z = (this.f55728g && this.f55716O0) || (this.f55729h && j2 == -1);
            this.f55717P0 = z;
            if (z) {
                this.f55714M0 = -1L;
            } else {
                long jM56929a = kmj.m56929a(((ob21) w2bVar).m66594i(strMo60230c));
                this.f55714M0 = jM56929a;
                if (jM56929a != -1) {
                    long j3 = jM56929a - j;
                    this.f55714M0 = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.f55714M0;
                this.f55714M0 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.f55714M0;
            if (j5 > 0 || j5 == -1) {
                m37623f(sjoVarM75643a, false);
            }
            return j2 != -1 ? j2 : this.f55714M0;
        } catch (Throwable th) {
            if (this.f55720Y == this.f55723b || (th instanceof Cache$CacheException)) {
                this.f55716O0 = true;
            }
            throw th;
        }
    }
}
