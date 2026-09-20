package p204p;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class yv31 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f276559c = Pattern.compile("\\[(\\d+)\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f276560d = Pattern.compile(":");

    /* JADX INFO: renamed from: a */
    public final fke f276561a;

    /* JADX INFO: renamed from: b */
    public final SimpleDateFormat f276562b;

    public yv31(xre xreVar, fke fkeVar) {
        this.f276561a = fkeVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        this.f276562b = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }
}
