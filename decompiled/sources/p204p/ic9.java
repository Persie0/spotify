package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.interapp.service.calls.EchoEndpoint$EchoRequest;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import com.spotify.remoteconfig.internal.ProductStateProto;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ic9 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100758a;

    /* JADX INFO: renamed from: b */
    public final Object f100759b;

    public /* synthetic */ ic9(int i, Object obj, Object obj2) {
        this.f100758a = i;
        this.f100759b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        xul0 hzq0Var;
        InputStream inputStreamOpenInputStream;
        int iM72083N;
        Object glr0Var;
        ovy[] ovyVarArrMo40153c;
        switch (this.f100758a) {
            case 0:
                tvx0 tvx0Var = ((vc9) this.f100759b).f240076a;
                tvx0Var.f224268a.mo88752q(new frv0(tvx0Var, 7));
                return w2a1.f247311a;
            case 1:
                return ((ozp) this.f100759b).m68657f();
            case 2:
                final String str = ((EchoEndpoint$EchoRequest) this.f100759b).f4609a;
                return new Object(str) { // from class: com.spotify.interapp.service.calls.EchoEndpoint$EchoResponse
                };
            case 3:
                return dq60.m36607g((wy3) ((q3v) this.f100759b).f184967a);
            case 4:
                Bitmap bitmapM75854u = rlg1.m75854u((String) this.f100759b, -16777216, -1, bht0.Thin, vgt0.f241313b, xgt0.Low);
                if (bitmapM75854u != null) {
                    return bitmapM75854u;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 5:
                xfr xfrVar = xfr.f261068Q0;
                vc20 vc20Var = (vc20) this.f100759b;
                if (vc20Var == vc20.f239647h) {
                    return new x510(vc20Var.f239651c, vc20Var.f239650b, vc20Var.f239654f == xfrVar);
                }
                String str2 = vc20Var.f239651c;
                String str3 = vc20Var.f239650b;
                return new w510(str2, str3, vc20Var.f239652d, vc20Var.f239653e, vc20Var.f239654f == xfrVar, str3);
            case 6:
                ((Runnable) this.f100759b).run();
                return null;
            case 7:
                return Boolean.valueOf(((oba0) this.f100759b).f163589a.mo48713h(pba0.f175747a, false));
            case 8:
                sdf0 sdf0Var = (sdf0) this.f100759b;
                biq0 biq0Var = (biq0) sdf0.m77833b(System.getProperty("ro.odm.csc.spotify.music.partnerid"), new e9f0(sdf0Var, 1));
                if (biq0Var != null) {
                    return biq0Var;
                }
                biq0 biq0Var2 = (biq0) sdf0.m77833b(((wej0) sdf0Var.f208010c).m87884g("ro.odm.csc.spotify.music.partnerid"), new kbf0(sdf0Var, 2));
                return biq0Var2 != null ? biq0Var2 : aiq0.f16080a;
            case 9:
                en6 en6Var = (en6) this.f100759b;
                en6Var.f61080e.set(true);
                try {
                    Process.setThreadPriority(10);
                    en6Var.m39471a();
                    Binder.flushPendingCommands();
                    en6Var.m39472b(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        en6Var.f61079d.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        en6Var.m39472b(null);
                        throw th2;
                    }
                }
            case 10:
                hv31 hv31Var = (hv31) ((lqk0) this.f100759b).f136081e.getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                fv31 fv31Var = n380.f149957o;
                fv31 fv31Var2 = n380.f149956n;
                if (!((mv31) hv31Var).m62894o(fv31Var)) {
                    lv31 lv31VarEdit = hv31Var.edit();
                    lv31VarEdit.m60050c(fv31Var, jCurrentTimeMillis);
                    lv31VarEdit.m60055h();
                } else if (jCurrentTimeMillis >= hv31Var.mo48715j(fv31Var) + ((long) 1209600000)) {
                    lv31 lv31VarEdit2 = hv31Var.edit();
                    lv31VarEdit2.m60048a(fv31Var2, true);
                    lv31VarEdit2.m60055h();
                }
                return w2a1.f247311a;
            case 11:
                ((d3l0) this.f100759b).m34865c(true);
                return w2a1.f247311a;
            case 12:
                ciq0 biq0Var3 = aiq0.f16080a;
                rpm0 rpm0Var = (rpm0) this.f100759b;
                if (rpm0.f201613e.contains(Build.BRAND.toLowerCase(Locale.ENGLISH))) {
                    return new ppm0(biq0Var3);
                }
                hv31 hv31Var2 = rpm0Var.f201614a.f212900a;
                fv31 fv31Var3 = spm0.f212899b;
                if (((mv31) hv31Var2).m62894o(fv31Var3)) {
                    String strMo48711f = hv31Var2.mo48711f(fv31Var3);
                    if (strMo48711f == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    hzq0Var = new hzq0(strMo48711f);
                } else {
                    hzq0Var = C2244p5.f174033a;
                }
                if (!hzq0Var.mo49279c()) {
                    return opm0.f167971a;
                }
                String str4 = (String) hzq0Var.mo49278b();
                if (str4 != null && str4.length() != 0) {
                    biq0Var3 = new biq0(str4, str4, false);
                }
                return new ppm0(biq0Var3);
            case 13:
                PictureSelectionActivity pictureSelectionActivity = (PictureSelectionActivity) this.f100759b;
                u010 u010Var = pictureSelectionActivity.f6549g1;
                Uri uriFromFile = null;
                if (u010Var == null) {
                    wj50.m88260d0("imageFileHelper");
                    throw null;
                }
                Uri uri = pictureSelectionActivity.f6558p1;
                wj50.m88279p(uri);
                m500 m500Var = (m500) u010Var.f225345b;
                InputStream inputStreamOpenInputStream2 = m500Var.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream2 != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                    inputStreamOpenInputStream2.close();
                    InputStream inputStreamOpenInputStream3 = m500Var.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream3 != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        int i = 1;
                        while (((options.outWidth / 2) / i) * ((options.outHeight / 2) / i) >= 4000000) {
                            i *= 2;
                            break;
                        }
                        options2.inSampleSize = i;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options2);
                        inputStreamOpenInputStream3.close();
                        if (bitmapDecodeStream != null && (inputStreamOpenInputStream = m500Var.getContentResolver().openInputStream(uri)) != null) {
                            ehx ehxVar = new ehx(inputStreamOpenInputStream);
                            inputStreamOpenInputStream.close();
                            int iM39032i = ehxVar.m39032i(1, "Orientation");
                            Matrix matrix = new Matrix();
                            int width = bitmapDecodeStream.getWidth();
                            int height = bitmapDecodeStream.getHeight();
                            int i2 = AudioEpisode.SHOW_URI_FIELD_NUMBER;
                            if (width > 2000 || height > 2000) {
                                float f = width;
                                float f2 = height;
                                float f3 = f / f2;
                                if (1.0f > f3) {
                                    int iM72083N2 = q3d0.m72083N(AudioEpisode.SHOW_URI_FIELD_NUMBER * f3);
                                    iM72083N = 2000;
                                    i2 = iM72083N2;
                                } else {
                                    iM72083N = q3d0.m72083N(AudioEpisode.SHOW_URI_FIELD_NUMBER / f3);
                                }
                                matrix.setScale(i2 / f, iM72083N / f2);
                            }
                            p271.m68921x(matrix, iM39032i);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                            if (bitmapCreateBitmap != null) {
                                ovy ovyVarM82095k = u010Var.m82095k(true);
                                if (ovyVarM82095k == null) {
                                    ovyVarM82095k = null;
                                } else {
                                    kwy kwyVarMo28558h = ((m12) u010Var.f225347d).mo28558h(ovyVarM82095k);
                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, kwyVarMo28558h);
                                    kwyVarMo28558h.close();
                                }
                                if (ovyVarM82095k != null) {
                                    uriFromFile = Uri.fromFile(ovyVarM82095k);
                                }
                            }
                        }
                    }
                }
                wj50.m88279p(uriFromFile);
                return uriFromFile;
            case 14:
                lv31 lv31VarEdit3 = ((hv31) ((lqk0) this.f100759b).f136081e.getValue()).edit();
                lv31VarEdit3.m60048a(n380.f149953k, true);
                lv31VarEdit3.m60055h();
                return w2a1.f247311a;
            case 15:
                lv31 lv31VarEdit4 = ((hv31) ((lqk0) this.f100759b).f136081e.getValue()).edit();
                lv31VarEdit4.m60048a(n380.f149954l, true);
                lv31VarEdit4.m60055h();
                return w2a1.f247311a;
            case 16:
                w0r0[] w0r0VarArrValues = w0r0.values();
                x0r0 x0r0Var = (x0r0) this.f100759b;
                ArrayList arrayList = new ArrayList(w0r0VarArrValues.length);
                for (w0r0 w0r0Var : w0r0VarArrValues) {
                    String string = x0r0Var.f256964a.getString(w0r0Var.f246801a);
                    float[] fArr = w0r0Var.f246802b;
                    ArrayList arrayList2 = new ArrayList(6);
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < 6) {
                        arrayList2.add(new gyy(edb.m38551G(6)[i4], fArr[i3]));
                        i3++;
                        i4++;
                    }
                    arrayList.add(new j0r0(string, arrayList2));
                }
                return g6f.m43711Y0(arrayList, new btm0(4));
            case 17:
                llr0 llr0Var = ((zkr0) this.f100759b).f283838a;
                synchronized (llr0Var) {
                    if (!llr0Var.f134691a.exists() || llr0Var.f134691a.length() == 0) {
                        utu0 utu0Var = gk71.f80747a;
                        utu0Var.m83940H("RCS");
                        utu0Var.m83941I("No product state for file <" + llr0Var.f134691a + ">. Returning the empty product state.", new Object[0]);
                        glr0Var = new glr0(pkr0.f178516a);
                    } else {
                        utu0 utu0Var2 = gk71.f80747a;
                        utu0Var2.m83940H("RCS");
                        utu0Var2.m83941I("Reading the latest product state for <" + llr0Var.f134691a + ">", new Object[0]);
                        try {
                            glr0Var = new flr0(new xuk0(ProductStateProto.m20416q(llr0Var.m59309a()), 20));
                        } catch (InvalidProtocolBufferException e) {
                            utu0 utu0Var3 = gk71.f80747a;
                            utu0Var3.m83940H("RCS");
                            utu0Var3.m83955x(e, "Can't parse protobuf from " + llr0Var.f134691a, new Object[0]);
                            glr0Var = new glr0(e);
                        }
                    }
                    break;
                }
                return glr0Var;
            case 18:
                vc20 vc20Var2 = (vc20) bk5.m29587J0(((c9t0) this.f100759b).f35654a.mo48717l(d9t0.f46898a, d9t0.f46899b.ordinal()), vc20.values());
                return vc20Var2 == null ? vc20.f239646g : vc20Var2;
            case 19:
                return (List) nsf1.m65528n(((m6u0) ((urt0) this.f100759b).f233454b).f140576a, true, false, new ctn0(1, 17));
            case 20:
                return c1v0.m31280a((c1v0) this.f100759b);
            case 21:
                return new dx10(wfx.m87988c(), "me", (Bundle) this.f100759b, eh30.f59473a, null, 48).m37181c();
            case 22:
                return Boolean.valueOf(((b2z0) this.f100759b).f22745a.mo48713h(b2z0.f22744b, false));
            case 23:
                return Boolean.valueOf(((hv31) ((rwt0) this.f100759b).f203414b).mo48713h(ic11.f100706a, true));
            case 24:
                nm11 nm11Var = (nm11) this.f100759b;
                nm11Var.f155267d.mo25060a(new ise1(nm11Var.f155264a), null);
                return w2a1.f247311a;
            case 25:
                return Boolean.valueOf(((re41) this.f100759b).f198281c.mo48713h(re41.f198277f, false));
            case 26:
                return ihf1.m50629m(((zf41) this.f100759b).f282207b.f239071a);
            case 27:
                View view = (View) ((WeakReference) this.f100759b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmapCreateBitmap2));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            case 28:
                return ((krc1) this.f100759b).m57152c();
            default:
                sdf0 sdf0Var2 = (sdf0) this.f100759b;
                aiq0 aiq0Var = aiq0.f16080a;
                String strM62624a = mrc1.m62624a();
                if (kgg1.m56363z(strM62624a) || (ovyVarArrMo40153c = ((jiq0) sdf0Var2.f208010c).f102622a.mo28560n(strM62624a).listFiles(new lrc1())) == null || ovyVarArrMo40153c.length == 0) {
                    return aiq0Var;
                }
                ewy ewyVar = (ewy) ovyVarArrMo40153c[0];
                String strSubstring = ewyVar.f63623b.getName().substring(16, ewyVar.f63623b.getName().length() - 4);
                return new biq0(strSubstring, strSubstring, false);
        }
    }

    public /* synthetic */ ic9(Object obj, int i) {
        this.f100758a = i;
        this.f100759b = obj;
    }

    public ic9(View view) {
        this.f100758a = 27;
        this.f100759b = new WeakReference(view);
    }
}
