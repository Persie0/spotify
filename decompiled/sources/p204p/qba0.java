package p204p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class qba0 {
    /* JADX INFO: renamed from: a */
    public static int m72489a(String str) {
        Pattern pattern = wcn0.f250078c;
        if (str.length() == 0) {
            return 3;
        }
        return pattern.matcher(str).matches() ? 1 : 2;
    }
}
