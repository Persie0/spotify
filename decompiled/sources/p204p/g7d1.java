package p204p;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol.WheelControlElementContainer;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class g7d1 implements Function, rdc1, r9w0, alg1, rsg1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77246a;

    /* JADX INFO: renamed from: b */
    public Object f77247b;

    /* JADX INFO: renamed from: c */
    public Object f77248c;

    /* JADX INFO: renamed from: d */
    public Object f77249d;

    public /* synthetic */ g7d1(int i) {
        this.f77246a = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p204p.alg1
    /* JADX INFO: renamed from: a */
    public void mo26346a(ong1 ong1Var, File file, boolean z) throws IllegalAccessException, IOException, InvocationTargetException {
        ((HashSet) this.f77247b).add(file);
        if (z) {
            return;
        }
        tif1 tif1Var = (tif1) this.f77248c;
        String str = tif1Var.f220679b;
        ZipEntry zipEntry = ong1Var.f167254b;
        tif1Var.f220678a.getAbsolutePath();
        zipEntry.getName();
        file.getAbsolutePath();
        ZipFile zipFile = (ZipFile) this.f77249d;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th4;
        }
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        switch (this.f77246a) {
            case 8:
                ev61 ev61Var = (ev61) obj2;
                lkf1 lkf1Var = (lkf1) this.f77248c;
                String str = (String) this.f77247b;
                aac aacVar = (aac) this.f77249d;
                cbh1 cbh1Var = (cbh1) obj;
                ig31.m50508z("Not active connection", lkf1Var.f134351G != 1);
                Context context = cbh1Var.f54558c;
                j45 j45VarM44803n = gif1.m44803n();
                gbf1 gbf1Var = (gbf1) cbh1Var.m37438q();
                Parcel parcelM43604d2 = gbf1Var.m43604d2();
                parcelM43604d2.writeString(str);
                fmf1.m42107b(parcelM43604d2, j45VarM44803n);
                gbf1Var.m43607g2(12, parcelM43604d2);
                if (aacVar != null) {
                    gbf1 gbf1Var2 = (gbf1) cbh1Var.m37438q();
                    Parcel parcelM43604d3 = gbf1Var2.m43604d2();
                    parcelM43604d3.writeString(str);
                    fmf1.m42107b(parcelM43604d3, j45VarM44803n);
                    gbf1Var2.m43607g2(11, parcelM43604d3);
                }
                ev61Var.m40097b(null);
                return;
            default:
                a3e1 a3e1Var = (a3e1) this.f77247b;
                fzj fzjVar = (fzj) this.f77248c;
                IntentFilter[] intentFilterArr = (IntentFilter[]) this.f77249d;
                ldg1 ldg1Var = (ldg1) obj;
                x5g1 x5g1Var = new x5g1(2, (ev61) obj2);
                iew0 iew0Var = ldg1Var.f132165G;
                beg1 beg1Var = new beg1(intentFilterArr);
                beg1Var.f26349l = fzjVar;
                synchronized (iew0Var.f101568a) {
                    try {
                        if (iew0Var.f101568a.get(a3e1Var) != null) {
                            if (Log.isLoggable("WearableClient", 2)) {
                                String.valueOf(a3e1Var);
                            }
                            x5g1Var.mo46192a(new Status(4001, null, null, null));
                            return;
                        }
                        if (Log.isLoggable("WearableClient", 2)) {
                            String.valueOf(a3e1Var);
                        }
                        iew0Var.f101568a.put(a3e1Var, beg1Var);
                        try {
                            o1g1 o1g1Var = (o1g1) ldg1Var.m37438q();
                            t1g1 t1g1Var = new t1g1(iew0Var.f101568a, a3e1Var, x5g1Var);
                            lrf1 lrf1Var = new lrf1(beg1Var);
                            Parcel parcelM43604d4 = o1g1Var.m43604d2();
                            int i = qmf1.f190217a;
                            parcelM43604d4.writeStrongBinder(t1g1Var);
                            qmf1.m73273c(parcelM43604d4, lrf1Var);
                            o1g1Var.m43603c2(16, parcelM43604d4);
                            return;
                        } catch (RemoteException e) {
                            if (Log.isLoggable("WearableClient", 3)) {
                                String.valueOf(a3e1Var);
                            }
                            iew0Var.f101568a.remove(a3e1Var);
                            throw e;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f77246a) {
            case 0:
                return ((Transport) obj).callStream((String) this.f77247b, (String) this.f77248c, (byte[]) this.f77249d);
            default:
                Set set = dd41.f47702f;
                roa roaVar = (roa) this.f77248c;
                dd41 dd41VarM74726U = r46.m74726U(roaVar.f201199b);
                sr31 sr31Var = ((vse1) this.f77249d).f244423g;
                String str = (String) this.f77247b;
                wj50.m88279p(str);
                return new pqm0((YourLibraryRequest) obj, sr31Var.m78995k(roaVar, str, dd41VarM74726U));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX INFO: renamed from: b */
    public xbh1 m43805b() {
        boolean z;
        boolean z2;
        String str = (String) this.f77247b;
        Uri uri = (Uri) this.f77248c;
        Uri uri2 = (Uri) this.f77249d;
        xbh1 xbh1Var = new xbh1(str, uri, uri2);
        c95.m31842h("The additional data exceeds the maximum allowed length %s.", 4096, str == null || str.length() <= 4096);
        if (uri == null || uri.getPath() == null) {
            z = true;
        } else {
            String path = uri.getPath();
            path.getClass();
            if (path.length() <= 512) {
                z = true;
            } else {
                z = false;
            }
        }
        c95.m31842h("The main stage URL path exceeds the maximum allowed length %s.", 512, z);
        if (uri2 != null && uri2.getPath() != null) {
            String path2 = uri2.getPath();
            path2.getClass();
            z2 = path2.length() <= 512;
        }
        c95.m31842h("The side panel URL path exceeds the maximum allowed length %s.", 512, z2);
        return xbh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.rsg1
    /* JADX INFO: renamed from: c */
    public Object mo31436c(String str, fbk fbkVar) {
        crg1 crg1Var;
        lsi0 lsi0Var;
        if (fbkVar instanceof crg1) {
            crg1Var = (crg1) fbkVar;
            int i = crg1Var.f41297d;
            if ((i & Integer.MIN_VALUE) != 0) {
                crg1Var.f41297d = i - Integer.MIN_VALUE;
            } else {
                crg1Var = new crg1(this, (ibk) fbkVar);
            }
        } else {
            crg1Var = new crg1(this, (ibk) fbkVar);
        }
        Object obj = crg1Var.f41295b;
        int i2 = crg1Var.f41297d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lsi0Var = (lsi0) this.f77249d;
            crg1Var.f41298e = str;
            crg1Var.f41294a = lsi0Var;
            crg1Var.f41297d = 1;
            Object objMo54248a = lsi0Var.mo54248a(crg1Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = crg1Var.f41294a;
            String str2 = crg1Var.f41298e;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            str = str2;
        }
        try {
            File cacheDir = ((Context) this.f77248c).getCacheDir();
            String str3 = (String) this.f77247b;
            StringBuilder sb = new StringBuilder(str3.length() + String.valueOf(str).length());
            sb.append(str3);
            sb.append(str);
            File file = new File(cacheDir, sb.toString());
            return file.exists() ? new String(pxy.m71563W(file), StandardCharsets.UTF_8) : null;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.rsg1
    /* JADX INFO: renamed from: d */
    public Object mo31437d(String str, String str2, fbk fbkVar) {
        frg1 frg1Var;
        lsi0 lsi0Var;
        if (fbkVar instanceof frg1) {
            frg1Var = (frg1) fbkVar;
            int i = frg1Var.f72483d;
            if ((i & Integer.MIN_VALUE) != 0) {
                frg1Var.f72483d = i - Integer.MIN_VALUE;
            } else {
                frg1Var = new frg1(this, (ibk) fbkVar);
            }
        } else {
            frg1Var = new frg1(this, (ibk) fbkVar);
        }
        Object obj = frg1Var.f72481b;
        int i2 = frg1Var.f72483d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lsi0Var = (lsi0) this.f77249d;
            frg1Var.f72484e = str;
            frg1Var.f72485f = str2;
            frg1Var.f72480a = lsi0Var;
            frg1Var.f72483d = 1;
            Object objMo54248a = lsi0Var.mo54248a(frg1Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = frg1Var.f72480a;
            str2 = frg1Var.f72485f;
            String str3 = frg1Var.f72484e;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            str = str3;
        }
        try {
            guc gucVar = new guc('A', 'z');
            ArrayList arrayList = new ArrayList(i6f.m49804T(gucVar, 10));
            Iterator it = gucVar.iterator();
            while (((fuc) it).f73467c) {
                arrayList.add(new Character(((fuc) it).m42728a()));
            }
            String strM43753y0 = g6f.m43753y0(((ArrayList) geg1.m44491D(arrayList)).subList(0, 8), "", null, null, null, 62);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(strM43753y0).length());
            sb.append(str);
            sb.append(strM43753y0);
            String string = sb.toString();
            Context context = (Context) this.f77248c;
            File cacheDir = context.getCacheDir();
            String str4 = (String) this.f77247b;
            StringBuilder sb2 = new StringBuilder(str4.length() + string.length());
            sb2.append(str4);
            sb2.append(string);
            File file = new File(cacheDir, sb2.toString());
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            if (file.exists() && !file.delete()) {
                throw new IOException("Unable to delete existing encrypted file");
            }
            pxy.m71566Z(file, bytes);
            File cacheDir2 = context.getCacheDir();
            StringBuilder sb3 = new StringBuilder(str4.length() + String.valueOf(str).length());
            sb3.append(str4);
            sb3.append(str);
            file.renameTo(new File(cacheDir2, sb3.toString()));
            lsi0Var.mo54249c(null);
            return w2a1.f247311a;
        } catch (Throwable th) {
            lsi0Var.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public Object m43806e() {
        Object objRemoveLast;
        synchronized (this.f77248c) {
            objRemoveLast = ((ArrayDeque) this.f77247b).removeLast();
        }
        return objRemoveLast;
    }

    /* JADX INFO: renamed from: f */
    public void m43807f(ua40 ua40Var) {
        Object objM43806e;
        s640 s640VarMo60750i1 = ua40Var.mo60750i1();
        ceb cebVar = s640VarMo60750i1 instanceof deb ? ((deb) s640VarMo60750i1).f48048a : null;
        if ((cebVar.mo31886h() != aeb.f14822f && cebVar.mo31886h() != aeb.f14820d) || cebVar.mo31888j() != zdb.f281668e || cebVar.mo31887i() != beb.f26318d) {
            ((pxd1) this.f77249d).getClass();
            ua40Var.close();
            return;
        }
        synchronized (this.f77248c) {
            try {
                objM43806e = ((ArrayDeque) this.f77247b).size() >= 3 ? m43806e() : null;
                ((ArrayDeque) this.f77247b).addFirst(ua40Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((pxd1) this.f77249d) == null || objM43806e == null) {
            return;
        }
        ((ua40) objM43806e).close();
    }

    /* JADX INFO: renamed from: g */
    public void m43808g(b9b1 b9b1Var) {
        try {
            ykg1 ykg1Var = (ykg1) this.f77248c;
            w9f1 w9f1Var = new w9f1(b9b1Var);
            Parcel parcelM43604d2 = ykg1Var.m43604d2();
            kmf1.m56902b(parcelM43604d2, w9f1Var);
            ykg1Var.m43606f2(9, parcelM43604d2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException((Throwable) e);
        }
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (WheelControlElementContainer) this.f77247b;
    }

    /* JADX INFO: renamed from: h */
    public Object m43809h(int i, mud1 mud1Var) {
        return x0h1.m89557A((luk) this.f77249d, new pwb1(i, 18, this, null), mud1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m43810i(String str, ibk ibkVar) {
        brg1 brg1Var;
        lsi0 lsi0Var;
        boolean z;
        if (ibkVar instanceof brg1) {
            brg1Var = (brg1) ibkVar;
            int i = brg1Var.f30094d;
            if ((i & Integer.MIN_VALUE) != 0) {
                brg1Var.f30094d = i - Integer.MIN_VALUE;
            } else {
                brg1Var = new brg1(this, ibkVar);
            }
        } else {
            brg1Var = new brg1(this, ibkVar);
        }
        Object obj = brg1Var.f30092b;
        int i2 = brg1Var.f30094d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lsi0Var = (lsi0) this.f77249d;
            brg1Var.f30095e = str;
            brg1Var.f30091a = lsi0Var;
            brg1Var.f30094d = 1;
            Object objMo54248a = lsi0Var.mo54248a(brg1Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = brg1Var.f30091a;
            String str2 = brg1Var.f30095e;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            str = str2;
        }
        try {
            try {
                File cacheDir = ((Context) this.f77248c).getCacheDir();
                String str3 = (String) this.f77247b;
                StringBuilder sb = new StringBuilder(str3.length() + String.valueOf(str).length());
                sb.append(str3);
                sb.append(str);
                File file = new File(cacheDir, sb.toString());
                z = file.exists() && file.delete();
            } finally {
                lsi0Var.mo54249c(null);
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j */
    public void m43811j(long j, String str, String str2) {
        mvg1 mvg1Var = (mvg1) this.f77247b;
        if (mvg1Var == null) {
            throw new IllegalStateException("Device is not connected");
        }
        ((lkf1) mvg1Var).m59265p(str, str2).m92992m(new gd5(this, j, 19));
    }

    /* JADX INFO: renamed from: k */
    public long m43812k() {
        return ((AtomicLong) this.f77248c).getAndIncrement();
    }

    /* JADX INFO: renamed from: l */
    public rch1 m43813l() {
        f9f1 f9f1VarM74854a;
        if (((pch1) this.f77247b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f77248c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        pch1 pch1Var = (pch1) this.f77247b;
        int i = pch1Var.f176108a;
        if (iBitLength != i) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(i);
            throw new GeneralSecurityException(sb.toString());
        }
        nch1 nch1Var = pch1Var.f176110c;
        nch1 nch1Var2 = nch1.f152520f;
        if (nch1Var != nch1Var2 && ((Integer) this.f77249d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (nch1Var == nch1Var2 && ((Integer) this.f77249d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (nch1Var == nch1Var2) {
            f9f1VarM74854a = r6h1.f196279a;
        } else if (nch1Var == nch1.f152519e || nch1Var == nch1.f152518d) {
            f9f1VarM74854a = r6h1.m74854a(((Integer) this.f77249d).intValue());
        } else {
            if (nch1Var != nch1.f152517c) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((pch1) this.f77247b).f176110c)));
            }
            f9f1VarM74854a = r6h1.m74855b(((Integer) this.f77249d).intValue());
        }
        return new rch1((pch1) this.f77247b, (BigInteger) this.f77248c, f9f1VarM74854a, (Integer) this.f77249d);
    }

    public /* synthetic */ g7d1(Object obj, Object obj2, Object obj3, int i) {
        this.f77246a = i;
        this.f77247b = obj;
        this.f77248c = obj2;
        this.f77249d = obj3;
    }

    public g7d1(roa roaVar, vse1 vse1Var, String str) {
        this.f77246a = 4;
        this.f77248c = roaVar;
        this.f77249d = vse1Var;
        this.f77247b = str;
    }

    public /* synthetic */ g7d1(lkf1 lkf1Var, String str, aac aacVar) {
        this.f77246a = 8;
        this.f77248c = lkf1Var;
        this.f77247b = str;
        this.f77249d = aacVar;
    }

    public g7d1(Application application) {
        this.f77246a = 13;
        this.f77248c = application;
        this.f77249d = msi0.m62770a();
        this.f77247b = "rce_";
    }

    public g7d1(tyb0 tyb0Var, ykg1 ykg1Var) {
        this.f77246a = 6;
        this.f77248c = ykg1Var;
        ig31.m50506x(tyb0Var);
        this.f77247b = tyb0Var;
    }

    public g7d1(ydw0 ydw0Var) {
        this.f77246a = 7;
        this.f77249d = ydw0Var;
        this.f77248c = new AtomicLong((acc.f14313b.nextLong() & 65535) * 10000);
    }

    public g7d1(pxd1 pxd1Var) {
        this.f77246a = 5;
        this.f77248c = new Object();
        this.f77247b = new ArrayDeque(3);
        this.f77249d = pxd1Var;
    }

    public g7d1(f7d1 f7d1Var, dc31 dc31Var, vme1 vme1Var, yle1 yle1Var) {
        this.f77246a = 3;
        this.f77247b = f7d1Var;
        this.f77248c = dc31Var;
        this.f77249d = vme1Var;
    }
}
