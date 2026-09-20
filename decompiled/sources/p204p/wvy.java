package p204p;

import android.net.Uri;
import com.spotify.share.file.api.FileDownloader$DownloadException;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class wvy {

    /* JADX INFO: renamed from: a */
    public final z4l0 f255636a;

    /* JADX INFO: renamed from: b */
    public final luk f255637b;

    public /* synthetic */ wvy(z4l0 z4l0Var, luk lukVar) {
        this.f255636a = z4l0Var;
        this.f255637b = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r11 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (p204p.x0h1.m89557A(r4, r10, r0) == r7) goto L36;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m89164a(Uri uri, ovy ovyVar, ibk ibkVar) throws Throwable {
        vvy vvyVar;
        n2x0 n2x0Var;
        if (ibkVar instanceof vvy) {
            vvyVar = (vvy) ibkVar;
            int i = vvyVar.f245359e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvyVar.f245359e = i - Integer.MIN_VALUE;
            } else {
                vvyVar = new vvy(this, ibkVar);
            }
        } else {
            vvyVar = new vvy(this, ibkVar);
        }
        Object objM89557A = vvyVar.f245357c;
        int i2 = vvyVar.f245359e;
        luk lukVar = this.f255637b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                ztw0 ztw0Var = new ztw0();
                ztw0Var.m96954g(uri.toString());
                zuu0 zuu0VarM95348b = this.f255636a.m95348b(new auw0(ztw0Var));
                vvyVar.f245355a = ovyVar;
                vvyVar.f245359e = 1;
                objM89557A = x0h1.m89557A(lukVar, new t8s(zuu0VarM95348b, fbkVar, 27), vvyVar);
                if (objM89557A == yukVar) {
                }
                return yukVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM89557A);
                    return w2a1.f247311a;
                }
                n2x0Var = vvyVar.f245356b;
                bga.m29073P(objM89557A);
                throw new FileDownloader$DownloadException("Http error: Got " + n2x0Var.f149860d + " " + n2x0Var.f149859c + "\n" + ((String) objM89557A), null);
            }
            ovyVar = vvyVar.f245355a;
            bga.m29073P(objM89557A);
            n2x0Var = (n2x0) objM89557A;
            if (n2x0Var.f149852O0) {
                qoy qoyVar = new qoy(n2x0Var.f149863g, new tuu0(gif1.m44798i(((ewy) ovyVar).f63623b, false)), fbkVar, 2);
                vvyVar.f245355a = null;
                vvyVar.f245356b = null;
                vvyVar.f245359e = 3;
            } else {
                vsr vsrVar = new vsr(n2x0Var, fbkVar, 4);
                vvyVar.f245355a = null;
                vvyVar.f245356b = n2x0Var;
                vvyVar.f245359e = 2;
                objM89557A = x0h1.m89557A(lukVar, vsrVar, vvyVar);
            }
            return yukVar;
        } catch (Throwable th) {
            throw new FileDownloader$DownloadException("Failed to download file", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m89165b(String str, ibk ibkVar) {
        fet0 fet0Var;
        if (ibkVar instanceof fet0) {
            fet0Var = (fet0) ibkVar;
            int i = fet0Var.f68832c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fet0Var.f68832c = i - Integer.MIN_VALUE;
            } else {
                fet0Var = new fet0(this, ibkVar);
            }
        } else {
            fet0Var = new fet0(this, ibkVar);
        }
        Object objM89557A = fet0Var.f68830a;
        int i2 = fet0Var.f68832c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                ztw0 ztw0Var = new ztw0();
                ztw0Var.m96954g(str);
                auw0 auw0Var = new auw0(ztw0Var);
                luk lukVar = this.f255637b;
                s6r0 s6r0Var = new s6r0(this, auw0Var, null, 17);
                fet0Var.f68832c = 1;
                objM89557A = x0h1.m89557A(lukVar, s6r0Var, fet0Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            zBooleanValue = ((Boolean) objM89557A).booleanValue();
        } catch (IOException | IllegalArgumentException unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m89166c(String str, File file, ibk ibkVar) throws Throwable {
        get0 get0Var;
        File file2;
        if (ibkVar instanceof get0) {
            get0Var = (get0) ibkVar;
            int i = get0Var.f79193e;
            if ((i & Integer.MIN_VALUE) != 0) {
                get0Var.f79193e = i - Integer.MIN_VALUE;
            } else {
                get0Var = new get0(this, ibkVar);
            }
        } else {
            get0Var = new get0(this, ibkVar);
        }
        Object objM89557A = get0Var.f79191c;
        int i2 = get0Var.f79193e;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                try {
                    ztw0 ztw0Var = new ztw0();
                    ztw0Var.m96954g(str);
                    try {
                        auw0 auw0Var = new auw0(ztw0Var);
                        luk lukVar = this.f255637b;
                        file2 = file;
                        try {
                            rgp0 rgp0Var = new rgp0(this, auw0Var, file2, null, 10);
                            get0Var.f79189a = str;
                            get0Var.f79190b = file2;
                            get0Var.f79193e = 1;
                            objM89557A = x0h1.m89557A(lukVar, rgp0Var, get0Var);
                            yuk yukVar = yuk.f276404a;
                            if (objM89557A == yukVar) {
                                return yukVar;
                            }
                            file = file2;
                        } catch (IOException unused) {
                            file = file2;
                            return new mfe1(edb.m38564m("IOException with ", file.getName()));
                        }
                    } catch (IOException unused2) {
                        file2 = file;
                    }
                } catch (IOException unused3) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = get0Var.f79190b;
                str = get0Var.f79189a;
                try {
                    bga.m29073P(objM89557A);
                } catch (IOException unused4) {
                    return new mfe1(edb.m38564m("IOException with ", file.getName()));
                }
            }
            return (ofe1) objM89557A;
        } catch (IllegalArgumentException unused5) {
            return new mfe1(edb.m38564m("IllegalArgumentException with ", str));
        }
    }
}
