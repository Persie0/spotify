package p204p;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class lvq implements a1q0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f137377a = Pattern.compile("(\\s*\\n\\s*){3,}");

    @Override // p204p.a1q0
    /* JADX INFO: renamed from: a */
    public final CharSequence mo24466a(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Matcher matcher = f137377a.matcher(charSequence);
        ArrayList<kvq> arrayList = new ArrayList();
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            arrayList.add(new kvq(iStart, iEnd, iEnd - iStart));
        }
        int i = 0;
        for (kvq kvqVar : arrayList) {
            int i2 = kvqVar.f126926a - i;
            spannableStringBuilder.delete(i2, kvqVar.f126927b - i);
            spannableStringBuilder.insert(i2, (CharSequence) "\n\n");
            i += kvqVar.f126928c - 2;
        }
        return wl51.m88491o1(spannableStringBuilder);
    }
}
