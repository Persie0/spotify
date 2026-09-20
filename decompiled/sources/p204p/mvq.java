package p204p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class mvq implements a1q0 {
    @Override // p204p.a1q0
    /* JADX INFO: renamed from: a */
    public final CharSequence mo24466a(CharSequence charSequence) {
        return Pattern.compile("(\\s*<br>\\s*)+").matcher(wl51.m88491o1(charSequence)).replaceAll("<br>");
    }
}
