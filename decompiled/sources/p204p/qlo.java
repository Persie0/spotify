package p204p;

import android.graphics.PathMeasure;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class qlo extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189891a;

    public /* synthetic */ qlo(int i) {
        this.f189891a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f189891a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(c0f1.f32774a);
                return simpleDateFormat;
            default:
                return new PathMeasure();
        }
    }
}
