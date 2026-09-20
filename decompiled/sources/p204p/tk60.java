package p204p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class tk60 implements l3b1 {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f221091a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f221091a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        ((m3b1) obj2).mo60660f(f221091a.format((Date) obj));
    }
}
