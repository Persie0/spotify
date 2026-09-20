package com.spotify.playlistartwork.setpictureimpl;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.CoroutineDaggerWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.proto.C1203a;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlistartwork.setpictureimpl.proto.RegisterPlaylistImageRequest;
import com.spotify.playlistartwork.setpictureimpl.proto.RegisterPlaylistImageResponse;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import p204p.C2069kx;
import p204p.ayd0;
import p204p.b890;
import p204p.bga;
import p204p.c150;
import p204p.c6x0;
import p204p.d890;
import p204p.dd41;
import p204p.duw0;
import p204p.e890;
import p204p.fbk;
import p204p.gva;
import p204p.ib8;
import p204p.ibk;
import p204p.jt4;
import p204p.kd40;
import p204p.kgg1;
import p204p.md40;
import p204p.n090;
import p204p.n0e1;
import p204p.n5h1;
import p204p.p2x0;
import p204p.q2y0;
import p204p.q831;
import p204p.qbn0;
import p204p.r46;
import p204p.rkp0;
import p204p.s1h1;
import p204p.s6x0;
import p204p.sco;
import p204p.t501;
import p204p.u501;
import p204p.urv0;
import p204p.v501;
import p204p.w2a1;
import p204p.w501;
import p204p.wj50;
import p204p.x0e1;
import p204p.x501;
import p204p.yrv0;
import p204p.yuk;
import p204p.yz80;
import p204p.zn91;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/playlistartwork/setpictureimpl/SetPlaylistPictureWorker;", "Lcom/spotify/androidx/workmanager/CoroutineDaggerWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_playlistartwork_setpictureimpl-setpictureimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SetPlaylistPictureWorker extends CoroutineDaggerWorker {

    /* JADX INFO: renamed from: g */
    public final Context f6459g;

    /* JADX INFO: renamed from: h */
    public yz80 f6460h;

    /* JADX INFO: renamed from: i */
    public q831 f6461i;

    /* JADX INFO: renamed from: j */
    public md40 f6462j;

    /* JADX INFO: renamed from: k */
    public rkp0 f6463k;

    /* JADX INFO: renamed from: l */
    public final NotificationManager f6464l;

    public SetPlaylistPictureWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f6459g = context;
        this.f6464l = (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.spotify.androidx.workmanager.CoroutineDaggerWorker
    /* JADX INFO: renamed from: i */
    public final Object mo3258i(C2069kx c2069kx) {
        m41019c(c150.m31242x(this.f6459g, this.f6464l));
        WorkerParameters workerParameters = this.f66917b;
        String strM77815d = workerParameters.f1404b.m77815d("KEY_PLAYLIST_URI");
        sco scoVar = workerParameters.f1404b;
        String strM77815d2 = scoVar.m77815d("KEY_IMAGE_URI");
        boolean zM77813b = scoVar.m77813b("KEY_SHOW_RETRY_SNACKBAR");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("KEY_IMAGE_URI", strM77815d2);
        sco scoVar2 = new sco(linkedHashMap);
        n0e1.m63412T(scoVar2);
        x0e1 x0e1Var = workerParameters.f1410h;
        n5h1.m63736l(new jt4(x0e1Var.f256874b.f160371a, "updateProgress", new ib8(x0e1Var, workerParameters.f1403a, scoVar2, 9), 16));
        return (strM77815d == null || strM77815d2 == null) ? new b890() : m19346m(strM77815d, Uri.parse(strM77815d2), zM77813b, c2069kx);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m19343j(String str, String str2, ibk ibkVar) {
        t501 t501Var;
        Object c6x0Var;
        if (ibkVar instanceof t501) {
            t501Var = (t501) ibkVar;
            int i = t501Var.f217190c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t501Var.f217190c = i - Integer.MIN_VALUE;
            } else {
                t501Var = new t501(this, ibkVar);
            }
        } else {
            t501Var = new t501(this, ibkVar);
        }
        Object objM75789a = t501Var.f217188a;
        int i2 = t501Var.f217190c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75789a);
                rkp0 rkp0Var = this.f6463k;
                if (rkp0Var == null) {
                    wj50.m88260d0("playlistImageEndpoint");
                    throw null;
                }
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(str).m35710h();
                yrv0 yrv0VarM19349o = RegisterPlaylistImageRequest.m19349o();
                yrv0VarM19349o.m94421m(str2);
                RegisterPlaylistImageRequest registerPlaylistImageRequest = (RegisterPlaylistImageRequest) yrv0VarM19349o.build();
                t501Var.f217190c = 1;
                objM75789a = rkp0Var.m75789a(strM35710h, registerPlaylistImageRequest, t501Var);
                yuk yukVar = yuk.f276404a;
                if (objM75789a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM75789a);
            }
            c6x0Var = (RegisterPlaylistImageResponse) objM75789a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to register image", new Object[0]);
        }
        bga.m29073P(c6x0Var);
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m19344k(String str, String str2, ibk ibkVar) {
        u501 u501Var;
        Object c6x0Var;
        if (ibkVar instanceof u501) {
            u501Var = (u501) ibkVar;
            int i = u501Var.f226874c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u501Var.f226874c = i - Integer.MIN_VALUE;
            } else {
                u501Var = new u501(this, ibkVar);
            }
        } else {
            u501Var = new u501(this, ibkVar);
        }
        Object objM63323t = u501Var.f226872a;
        int i2 = u501Var.f226874c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM63323t);
                yz80 yz80Var = this.f6460h;
                if (yz80Var == null) {
                    wj50.m88260d0("listOperation");
                    throw null;
                }
                u501Var.f226874c = 1;
                C1203a c1203aM18507s = ModificationRequest.Attributes.m18507s();
                c1203aM18507s.m18676s(str2);
                objM63323t = ((n090) yz80Var).m63323t(str, c1203aM18507s, u501Var);
                yuk yukVar = yuk.f276404a;
                if (objM63323t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63323t);
            }
            ((p2x0) objM63323t).m68971d();
            c6x0Var = w2a1Var;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to set picture", new Object[0]);
        }
        bga.m29073P(c6x0Var);
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m19345l(String str, Uri uri, ibk ibkVar) {
        v501 v501Var;
        SetPlaylistPictureWorker setPlaylistPictureWorker;
        SetPlaylistPictureWorker setPlaylistPictureWorker2;
        String str2;
        SetPlaylistPictureWorker setPlaylistPictureWorker3;
        String str3;
        String strM63415W;
        if (ibkVar instanceof v501) {
            v501Var = (v501) ibkVar;
            int i = v501Var.f237285g;
            if ((i & Integer.MIN_VALUE) != 0) {
                v501Var.f237285g = i - Integer.MIN_VALUE;
            } else {
                v501Var = new v501(this, ibkVar);
            }
        } else {
            v501Var = new v501(this, ibkVar);
        }
        Object objM19347n = v501Var.f237283e;
        int i2 = v501Var.f237285g;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM19347n);
            if (wj50.m88271j(Uri.EMPTY, uri)) {
                v501Var.f237279a = null;
                v501Var.f237285g = 1;
                if (m19344k(str, "", v501Var) != yukVar) {
                    return null;
                }
            } else {
                v501Var.f237279a = str;
                v501Var.f237280b = this;
                v501Var.f237281c = this;
                v501Var.f237282d = str;
                v501Var.f237285g = 2;
                objM19347n = m19347n(uri, v501Var);
                if (objM19347n != yukVar) {
                    setPlaylistPictureWorker = this;
                    setPlaylistPictureWorker2 = setPlaylistPictureWorker;
                    str2 = str;
                }
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM19347n);
            return null;
        }
        if (i2 == 2) {
            str = v501Var.f237282d;
            setPlaylistPictureWorker = v501Var.f237281c;
            setPlaylistPictureWorker2 = (SetPlaylistPictureWorker) v501Var.f237280b;
            str2 = v501Var.f237279a;
            bga.m29073P(objM19347n);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = (String) v501Var.f237280b;
                bga.m29073P(objM19347n);
                return str4;
            }
            setPlaylistPictureWorker3 = (SetPlaylistPictureWorker) v501Var.f237280b;
            str3 = v501Var.f237279a;
            bga.m29073P(objM19347n);
        }
        gva picture = ((RegisterPlaylistImageResponse) objM19347n).getPicture();
        setPlaylistPictureWorker3.getClass();
        strM63415W = n0e1.m63415W(picture.m45891s());
        v501Var.f237279a = null;
        v501Var.f237280b = strM63415W;
        v501Var.f237285g = 4;
        if (m19344k(str3, strM63415W, v501Var) != yukVar) {
            return yukVar;
        }
        return strM63415W;
        String str5 = ((kd40) objM19347n).f121605a;
        v501Var.f237279a = str2;
        v501Var.f237280b = setPlaylistPictureWorker2;
        v501Var.f237281c = null;
        v501Var.f237282d = null;
        v501Var.f237285g = 3;
        objM19347n = setPlaylistPictureWorker.m19343j(str, str5, v501Var);
        if (objM19347n != yukVar) {
            setPlaylistPictureWorker3 = setPlaylistPictureWorker2;
            str3 = str2;
            gva picture2 = ((RegisterPlaylistImageResponse) objM19347n).getPicture();
            setPlaylistPictureWorker3.getClass();
            strM63415W = n0e1.m63415W(picture2.m45891s());
            v501Var.f237279a = null;
            v501Var.f237280b = strM63415W;
            v501Var.f237285g = 4;
            if (m19344k(str3, strM63415W, v501Var) != yukVar) {
                return strM63415W;
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:49:0x00d3, B:20:0x0043, B:44:0x00ba, B:46:0x00c2, B:50:0x00d6, B:41:0x00a0), top: B:57:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:49:0x00d3, B:20:0x0043, B:44:0x00ba, B:46:0x00c2, B:50:0x00d6, B:41:0x00a0), top: B:57:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r15 == r7) goto L48;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19346m(String str, Uri uri, boolean z, ibk ibkVar) {
        w501 w501Var;
        Object c6x0Var;
        String str2;
        boolean z2;
        Object b890Var;
        b890 b890Var2;
        if (ibkVar instanceof w501) {
            w501Var = (w501) ibkVar;
            int i = w501Var.f247954g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w501Var.f247954g = i - Integer.MIN_VALUE;
            } else {
                w501Var = new w501(this, ibkVar);
            }
        } else {
            w501Var = new w501(this, ibkVar);
        }
        Object objM76978s = w501Var.f247952e;
        int i2 = w501Var.f247954g;
        int i3 = 0;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM76978s);
                    w501Var.f247948a = str;
                    w501Var.f247949b = uri;
                    w501Var.f247950c = z;
                    w501Var.f247951d = 0;
                    w501Var.f247954g = 1;
                    objM76978s = m19345l(str, uri, w501Var);
                    if (objM76978s == obj) {
                    }
                    return obj;
                }
                if (i2 == 1) {
                    z = w501Var.f247950c;
                    uri = w501Var.f247949b;
                    str = w501Var.f247948a;
                    bga.m29073P(objM76978s);
                } else {
                    if (i2 == 2) {
                        i3 = w501Var.f247951d;
                        z2 = w501Var.f247950c;
                        uri = w501Var.f247949b;
                        str2 = w501Var.f247948a;
                        bga.m29073P(objM76978s);
                        if (((Boolean) objM76978s).booleanValue()) {
                            w501Var.f247948a = null;
                            w501Var.f247949b = null;
                            w501Var.f247950c = z2;
                            w501Var.f247951d = i3;
                            w501Var.f247954g = 3;
                            objM76978s = m19346m(str2, uri, true, w501Var);
                        } else {
                            b890Var = new b890();
                        }
                        c6x0Var = b890Var;
                        b890Var2 = new b890();
                        if (c6x0Var instanceof c6x0) {
                            return b890Var2;
                        }
                        return c6x0Var;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76978s);
                }
                b890Var = (e890) objM76978s;
                c6x0Var = b890Var;
                b890Var2 = new b890();
                if (c6x0Var instanceof c6x0) {
                    return b890Var2;
                }
                return c6x0Var;
                String str3 = (String) objM76978s;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("KEY_IMAGE_URI", uri.toString());
                if (str3 != null) {
                    linkedHashMap.put("KEY_UPLOADED_IMAGE_ID", str3);
                }
                sco scoVar = new sco(linkedHashMap);
                n0e1.m63412T(scoVar);
                c6x0Var = new d890(scoVar);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
        } catch (Throwable th2) {
            c6x0Var = new c6x0(th2);
        }
        boolean z3 = z;
        str2 = str;
        z2 = z3;
        if (s6x0.m77348a(c6x0Var) != null) {
            if (z2) {
                w501Var.f247948a = str2;
                w501Var.f247949b = uri;
                w501Var.f247950c = z2;
                w501Var.f247951d = 0;
                w501Var.f247954g = 2;
                objM76978s = s1h1.m76978s(10000L, new q2y0(this, fbkVar, 14), w501Var);
                if (objM76978s != obj) {
                    if (((Boolean) objM76978s).booleanValue()) {
                        w501Var.f247948a = null;
                        w501Var.f247949b = null;
                        w501Var.f247950c = z2;
                        w501Var.f247951d = i3;
                        w501Var.f247954g = 3;
                        objM76978s = m19346m(str2, uri, true, w501Var);
                    } else {
                        b890Var = new b890();
                    }
                }
                return obj;
            }
            b890Var = new b890();
            c6x0Var = b890Var;
        }
        b890Var2 = new b890();
        if (c6x0Var instanceof c6x0) {
            return b890Var2;
        }
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: n */
    public final Object m19347n(Uri uri, ibk ibkVar) {
        x501 x501Var;
        Object c6x0Var;
        ayd0 ayd0VarM96520H;
        if (ibkVar instanceof x501) {
            x501Var = (x501) ibkVar;
            int i = x501Var.f258238c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x501Var.f258238c = i - Integer.MIN_VALUE;
            } else {
                x501Var = new x501(this, ibkVar);
            }
        } else {
            x501Var = new x501(this, ibkVar);
        }
        Object objM61508a = x501Var.f258236a;
        int i2 = x501Var.f258238c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM61508a);
                ContentResolver contentResolver = this.f6459g.getContentResolver();
                String type = contentResolver.getType(uri);
                if (type == null) {
                    type = "image/jpeg";
                }
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new IllegalArgumentException("Unable to open file descriptor for URI: " + uri);
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        byte[] bArrM56361x = kgg1.m56361x(fileInputStream);
                        urv0 urv0Var = ayd0.f21209e;
                        try {
                            ayd0VarM96520H = zn91.m96520H(type);
                        } catch (IllegalArgumentException unused) {
                            ayd0VarM96520H = null;
                        }
                        duw0 duw0VarM72503d = qbn0.m72503d(6, ayd0VarM96520H, bArrM56361x);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        md40 md40Var = this.f6462j;
                        if (md40Var == null) {
                            wj50.m88260d0("imageUploadEndpoint");
                            throw null;
                        }
                        x501Var.f258238c = 1;
                        objM61508a = md40Var.m61508a(duw0VarM72503d, x501Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM61508a == yukVar) {
                            return yukVar;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            n0e1.m63430g(fileInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        n0e1.m63430g(parcelFileDescriptorOpenFileDescriptor, th3);
                        throw th4;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61508a);
            }
            c6x0Var = (kd40) objM61508a;
        } catch (Throwable th5) {
            c6x0Var = new c6x0(th5);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to upload image", new Object[0]);
        }
        bga.m29073P(c6x0Var);
        return c6x0Var;
    }
}
