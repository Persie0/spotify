package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class fd40 implements bd40 {

    /* JADX INFO: renamed from: a */
    public final Context f68316a;

    /* JADX INFO: renamed from: b */
    public final luk f68317b;

    public fd40(Context context, luk lukVar) {
        this.f68316a = context;
        this.f68317b = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m41353a(fd40 fd40Var, String str) throws IOException {
        int iM39032i;
        int i;
        Context context = fd40Var.f68316a;
        Uri uri = Uri.parse(str);
        if (Build.VERSION.SDK_INT >= 28) {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri), new cd40());
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new IllegalArgumentException("Unable to open image: " + uri);
        }
        try {
            byte[] bArrM56361x = kgg1.m56361x(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM56361x);
                try {
                    iM39032i = new ehx(byteArrayInputStream).m39032i(1, "Orientation");
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(byteArrayInputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                Logger.m3967c(e, edb.m38564m("Error reading EXIF orientation: ", e.getMessage()), new Object[0]);
                iM39032i = 1;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArrM56361x, 0, bArrM56361x.length, options);
            int iMax = Math.max(options.outWidth, options.outHeight);
            if (iMax <= 3072) {
                i = 1;
            } else {
                i = 1;
                while (iMax / i > 3072) {
                    i *= 2;
                }
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i;
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM56361x, 0, bArrM56361x.length, options2);
            if (bitmapDecodeByteArray == null) {
                throw new IllegalArgumentException("Unable to decode image: " + uri);
            }
            if (iM39032i == 0 || iM39032i == 1) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            switch (iM39032i) {
                case 2:
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    break;
                case 4:
                    matrix.preScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.postRotate(270.0f);
                    break;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
            bitmapDecodeByteArray.recycle();
            return bitmapCreateBitmap;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n0e1.m63430g(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m41354b(fd40 fd40Var, Bitmap bitmap, File file, int i) throws Exception {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, bufferedOutputStream);
                bufferedOutputStream.close();
                file.getAbsolutePath();
                file.length();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(bufferedOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            file.delete();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m41355c(String str, z940 z940Var, t52 t52Var, ibk ibkVar) {
        dd40 dd40Var;
        if (ibkVar instanceof dd40) {
            dd40Var = (dd40) ibkVar;
            int i = dd40Var.f47701c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dd40Var.f47701c = i - Integer.MIN_VALUE;
            } else {
                dd40Var = new dd40(this, ibkVar);
            }
        } else {
            dd40Var = new dd40(this, ibkVar);
        }
        Object objM89557A = dd40Var.f47699a;
        int i2 = dd40Var.f47701c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            ed40 ed40Var = new ed40(t52Var, this, str, z940Var, null);
            dd40Var.f47701c = 1;
            objM89557A = x0h1.m89557A(this.f68317b, ed40Var, dd40Var);
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
        return ((s6x0) objM89557A).f206218a;
    }
}
