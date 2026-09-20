package p204p;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class ed40 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f58438b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fd40 f58439c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f58440d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ z940 f58441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed40(gh00 gh00Var, fd40 fd40Var, String str, z940 z940Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f58438b = gh00Var;
        this.f58439c = fd40Var;
        this.f58440d = str;
        this.f58441e = z940Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        ed40 ed40Var = new ed40(this.f58438b, this.f58439c, this.f58440d, this.f58441e, fbkVar);
        ed40Var.f58437a = obj;
        return ed40Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((ed40) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        Object c6x0Var;
        bga.m29073P(obj);
        gh00 gh00Var = this.f58438b;
        fd40 fd40Var = this.f58439c;
        String str = this.f58440d;
        z940 z940Var = this.f58441e;
        try {
            gh00Var.invoke(new Float(0.1f));
            Bitmap bitmapM41353a = fd40.m41353a(fd40Var, str);
            if (Build.VERSION.SDK_INT >= 34) {
                bitmapM41353a.setGainmap(null);
            }
            try {
                gh00Var.invoke(new Float(0.3f));
                String str2 = z940Var.f280661a + ".jpg";
                File file = new File(str2);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                long jLongValue = z940Var.f280662b.longValue() - 51200;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = 85;
                bitmapM41353a.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                if (byteArrayOutputStream.size() > jLongValue) {
                    int i2 = 60;
                    int i3 = 95;
                    i = 60;
                    while (i2 <= i3) {
                        int i4 = (i2 + i3) / 2;
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        bitmapM41353a.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream2);
                        if (byteArrayOutputStream2.size() <= jLongValue) {
                            i2 = i4 + 5;
                            i = i4;
                        } else {
                            i3 = i4 - 5;
                        }
                        if (i3 - i2 < 5) {
                            break;
                        }
                    }
                }
                gh00Var.invoke(new Float(0.6f));
                fd40.m41354b(fd40Var, bitmapM41353a, file, i);
                gh00Var.invoke(new Float(1.0f));
                c6x0Var = new ad40(str2, bitmapM41353a.getWidth(), bitmapM41353a.getHeight());
            } finally {
                bitmapM41353a.recycle();
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return new s6x0(c6x0Var);
    }
}
