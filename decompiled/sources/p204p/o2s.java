package p204p;

import android.net.Uri;
import android.os.Build;
import com.spotify.music.R;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class o2s extends ap01 {

    /* JADX INFO: renamed from: a */
    public final fq9 f161137a;

    /* JADX INFO: renamed from: b */
    public final b5p f161138b;

    /* JADX INFO: renamed from: c */
    public final n95 f161139c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2524w8 f161140d = opo.m67566p(tj01.IMAGE, tj01.VIDEO);

    /* JADX INFO: renamed from: e */
    public final gp01 f161141e = gp01.f83051d;

    /* JADX INFO: renamed from: f */
    public final x401 f161142f;

    /* JADX INFO: renamed from: g */
    public final xo01 f161143g;

    public o2s(fq9 fq9Var, b5p b5pVar, n95 n95Var) {
        this.f161137a = fq9Var;
        this.f161138b = b5pVar;
        this.f161139c = n95Var;
        x401 x401Var = new x401();
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            x401Var.add(new pqm0("android.permission.WRITE_EXTERNAL_STORAGE", Boolean.TRUE));
        }
        if (i >= 33) {
            x401Var.add(new pqm0("android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        }
        this.f161142f = n0e1.m63425d(x401Var);
        this.f161143g = new xo01(spu.f212955c);
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: a */
    public final fq01 mo30099a() {
        return this.f161141e;
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 mo30100b() {
        return this.f161140d;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: c */
    public final int mo43583c() {
        return R.string.share_app_download_content_description;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: d */
    public final nsg1 mo43584d() {
        return this.f161143g;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: e */
    public final int mo43585e() {
        return R.string.share_app_download;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ap01
    /* JADX INFO: renamed from: f */
    public final Object mo26627f(iq01 iq01Var, fbk fbkVar) throws Throwable {
        m2s m2sVar;
        Object objM81515j;
        if (fbkVar instanceof m2s) {
            m2sVar = (m2s) fbkVar;
            int i = m2sVar.f139455d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2sVar.f139455d = i - Integer.MIN_VALUE;
            } else {
                m2sVar = new m2s(this, (ibk) fbkVar);
            }
        } else {
            m2sVar = new m2s(this, (ibk) fbkVar);
        }
        Object obj = m2sVar.f139453b;
        int i2 = m2sVar.f139455d;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            ho01 ho01Var = iq01Var.f104590a;
            if (ho01Var instanceof lc40) {
                m2sVar.f139452a = iq01Var;
                m2sVar.f139455d = 1;
                Uri uri = ((lc40) ho01Var).f131817a;
                if (uri == null) {
                    objM81515j = w2a1Var;
                } else {
                    objM81515j = ttg1.m81515j(new h5q(this.f161137a, uri, fbkVar2, 18), m2sVar);
                    if (objM81515j != yukVar) {
                        objM81515j = w2a1Var;
                    }
                }
                if (objM81515j != yukVar) {
                    objM81515j = w2a1Var;
                }
                if (objM81515j != yukVar) {
                }
            } else {
                if (!(ho01Var instanceof vd51)) {
                    throw new IllegalStateException(("Unsupported share data type for download: " + qpv0.f191387a.mo54112b(ho01Var.getClass()).mo29111F()).toString());
                }
                m2sVar.f139452a = iq01Var;
                m2sVar.f139455d = 2;
                String path = Uri.parse(((vd51) ho01Var).f240319b.f55870d).getPath();
                if (path == null) {
                    throw new IllegalStateException("Video file path is null");
                }
                File file = new File(path);
                if (!file.exists()) {
                    throw new IllegalStateException(edb.m38564m("Video file does not exist: ", file.getAbsolutePath()).toString());
                }
                h77 h77Var = (h77) this.f161138b.f23636b;
                Object objM89557A = x0h1.m89557A((luk) h77Var.f88360c, new qw11(h77Var, file, ((pzs0) h77Var.f88359b).m71778p(".mp4"), fbkVar2, 25), m2sVar);
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                }
            }
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        iq01Var = m2sVar.f139452a;
        bga.m29073P(obj);
        a611 a611Var = iq01Var.f104591b;
        m2sVar.f139452a = null;
        m2sVar.f139455d = 3;
        n95 n95Var = this.f161139c;
        Object objM89557A2 = x0h1.m89557A((luk) n95Var.f151718b, new qhk(n95Var, a611Var, fbkVar2, 1), m2sVar);
        if (objM89557A2 != yukVar) {
            objM89557A2 = w2a1Var;
        }
        return objM89557A2 == yukVar ? yukVar : w2a1Var;
    }
}
