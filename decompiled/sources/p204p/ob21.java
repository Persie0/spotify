package p204p;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class ob21 implements w2b {

    /* JADX INFO: renamed from: k */
    public static final HashSet f163515k = new HashSet();

    /* JADX INFO: renamed from: a */
    public final File f163516a;

    /* JADX INFO: renamed from: b */
    public final q3b f163517b;

    /* JADX INFO: renamed from: c */
    public final kcj0 f163518c;

    /* JADX INFO: renamed from: d */
    public final n95 f163519d;

    /* JADX INFO: renamed from: e */
    public final HashMap f163520e;

    /* JADX INFO: renamed from: f */
    public final Random f163521f;

    /* JADX INFO: renamed from: g */
    public final boolean f163522g;

    /* JADX INFO: renamed from: h */
    public long f163523h;

    /* JADX INFO: renamed from: i */
    public boolean f163524i;

    /* JADX INFO: renamed from: j */
    public Cache$CacheException f163525j;

    public ob21(File file, q3b q3bVar, elo eloVar, boolean z) {
        boolean zAdd;
        kcj0 kcj0Var = new kcj0(eloVar, file, z);
        n95 n95Var = (eloVar == null || z) ? null : new n95(eloVar);
        synchronized (ob21.class) {
            zAdd = f163515k.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f163516a = file;
        this.f163517b = q3bVar;
        this.f163518c = kcj0Var;
        this.f163519d = n95Var;
        this.f163520e = new HashMap();
        this.f163521f = new Random();
        this.f163522g = q3bVar.mo31126d();
        this.f163523h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new nb21(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX INFO: renamed from: a */
    public static void m66585a(ob21 ob21Var) {
        long j;
        n95 n95Var = ob21Var.f163519d;
        kcj0 kcj0Var = ob21Var.f163518c;
        File file = ob21Var.f163516a;
        if (!file.exists()) {
            try {
                m66586e(file);
            } catch (Cache$CacheException e) {
                ob21Var.f163525j = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            yif1.m93808r(str);
            ob21Var.f163525j = new Cache$CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    yif1.m93808r("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        ob21Var.f163523h = j;
        if (j == -1) {
            try {
                ob21Var.f163523h = m66587f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                yif1.m93810s(str2, e2);
                ob21Var.f163525j = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            kcj0Var.m56071J(ob21Var.f163523h);
            if (n95Var != null) {
                n95Var.m63906r(ob21Var.f163523h);
                HashMap mapM63904o = n95Var.m63904o();
                ob21Var.m66595j(file, true, fileArrListFiles, mapM63904o);
                n95Var.m63894B(mapM63904o.keySet());
            } else {
                ob21Var.m66595j(file, true, fileArrListFiles, null);
            }
            kcj0Var.m56082W();
            try {
                kcj0Var.m56090e0();
            } catch (IOException e3) {
                yif1.m93810s("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            yif1.m93810s(str3, e4);
            ob21Var.f163525j = new Cache$CacheException(str3, e4);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m66586e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        yif1.m93808r(str);
        throw new Cache$CacheException(str);
    }

    /* JADX INFO: renamed from: f */
    public static long m66587f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, s571.m77250i(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* JADX INFO: renamed from: q */
    public static synchronized void m66588q(File file) {
        f163515k.remove(file.getAbsoluteFile());
    }

    /* JADX INFO: renamed from: b */
    public final void m66589b(pb21 pb21Var) {
        String str = pb21Var.f108643a;
        this.f163518c.m56070I(str).m87178a(pb21Var);
        ArrayList arrayList = (ArrayList) this.f163520e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q3b) arrayList.get(size)).mo31123a(this, pb21Var);
            }
        }
        this.f163517b.mo31123a(this, pb21Var);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m66590c(String str, n6i n6iVar) {
        c95.m31855u(!this.f163524i);
        m66591d();
        this.f163518c.m56095s(str, n6iVar);
        try {
            this.f163518c.m56090e0();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m66591d() {
        Cache$CacheException cache$CacheException = this.f163525j;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized long m66592g(long j, String str, long j2) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long jM66593h = m66593h(j6, str, j5 - j6);
            if (jM66593h > 0) {
                j3 += jM66593h;
            } else {
                jM66593h = -jM66593h;
            }
            j6 += jM66593h;
        }
        return j3;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized long m66593h(long j, String str, long j2) {
        w4b w4bVarM56065C;
        c95.m31855u(!this.f163524i);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        w4bVarM56065C = this.f163518c.m56065C(str);
        return w4bVarM56065C != null ? w4bVarM56065C.m87179b(j, j2) : -j2;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized r8p m66594i(String str) {
        c95.m31855u(!this.f163524i);
        return this.f163518c.m56069H(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m66595j(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m66595j(file2, false, file2.listFiles(), map);
            } else if (!z || (!kcj0.m56057L(name) && !name.endsWith(".uid"))) {
                t3b t3bVar = map != null ? (t3b) map.remove(name) : null;
                if (t3bVar != null) {
                    j = t3bVar.f216736a;
                    j2 = t3bVar.f216737b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                pb21 pb21VarM69509b = pb21.m69509b(file2, j, j2, this.f163518c);
                if (pb21VarM69509b != null) {
                    m66589b(pb21VarM69509b);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m66596k(pb21 pb21Var) {
        c95.m31855u(!this.f163524i);
        w4b w4bVarM56065C = this.f163518c.m56065C(pb21Var.f108643a);
        w4bVarM56065C.getClass();
        w4bVarM56065C.m87188k(pb21Var.f108644b);
        this.f163518c.m56079T(w4bVarM56065C.f247761b);
        notifyAll();
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m66597l(String str) {
        w4b w4bVarM56065C;
        c95.m31855u(!this.f163524i);
        synchronized (this) {
            try {
                c95.m31855u(!this.f163524i);
                w4bVarM56065C = this.f163518c.m56065C(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((w4bVarM56065C == null || w4bVarM56065C.m87183f()) ? new TreeSet() : new TreeSet((Collection) w4bVarM56065C.m87182e())).iterator();
        while (it.hasNext()) {
            m66598m((j4b) it.next());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m66598m(j4b j4bVar) {
        String str = j4bVar.f108643a;
        kcj0 kcj0Var = this.f163518c;
        w4b w4bVarM56065C = kcj0Var.m56065C(str);
        if (w4bVarM56065C == null || !w4bVarM56065C.m87186i(j4bVar)) {
            return;
        }
        n95 n95Var = this.f163519d;
        if (n95Var != null) {
            File file = j4bVar.f108647e;
            file.getClass();
            String name = file.getName();
            try {
                ((String) n95Var.f151717a).getClass();
                try {
                    ((elo) n95Var.f151718b).getWritableDatabase().delete((String) n95Var.f151717a, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                tfe.m80657o("Failed to remove file index entry for: ", name);
            }
        }
        kcj0Var.m56079T(w4bVarM56065C.f247761b);
        ArrayList arrayList = (ArrayList) this.f163520e.get(j4bVar.f108643a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q3b) arrayList.get(size)).mo31127e(j4bVar);
            }
        }
        this.f163517b.mo31127e(j4bVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m66599n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f163518c.m56066D().iterator();
        while (it.hasNext()) {
            for (j4b j4bVar : ((w4b) it.next()).m87182e()) {
                File file = j4bVar.f108647e;
                file.getClass();
                if (file.length() != j4bVar.f108645c) {
                    arrayList.add(j4bVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m66598m((j4b) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized pb21 m66600o(long j, String str, long j2) {
        pb21 pb21VarM87181d;
        pb21 pb21VarM69511d;
        c95.m31855u(!this.f163524i);
        m66591d();
        w4b w4bVarM56065C = this.f163518c.m56065C(str);
        if (w4bVarM56065C == null) {
            pb21VarM69511d = pb21.m69511d(j, str, j2);
        } else {
            while (true) {
                pb21VarM87181d = w4bVarM56065C.m87181d(j, j2);
                if (!pb21VarM87181d.f108646d) {
                    break;
                }
                File file = pb21VarM87181d.f108647e;
                file.getClass();
                if (file.length() == pb21VarM87181d.f108645c) {
                    break;
                }
                m66599n();
            }
            pb21VarM69511d = pb21VarM87181d;
        }
        if (pb21VarM69511d.f108646d) {
            return m66601p(str, pb21VarM69511d);
        }
        if (this.f163518c.m56070I(str).m87185h(j, pb21VarM69511d.f108645c)) {
            return pb21VarM69511d;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final pb21 m66601p(String str, pb21 pb21Var) {
        boolean z;
        if (!this.f163522g) {
            return pb21Var;
        }
        File file = pb21Var.f108647e;
        file.getClass();
        String name = file.getName();
        long j = pb21Var.f108645c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        n95 n95Var = this.f163519d;
        if (n95Var != null) {
            try {
                n95Var.m63895C(j, name, jCurrentTimeMillis);
            } catch (IOException unused) {
                yif1.m93819w0("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        w4b w4bVarM56065C = this.f163518c.m56065C(str);
        w4bVarM56065C.getClass();
        pb21 pb21VarM87187j = w4bVarM56065C.m87187j(pb21Var, jCurrentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.f163520e.get(pb21Var.f108643a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q3b) arrayList.get(size)).mo31125c(this, pb21Var, pb21VarM87187j);
            }
        }
        this.f163517b.mo31125c(this, pb21Var, pb21VarM87187j);
        return pb21VarM87187j;
    }
}
