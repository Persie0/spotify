package p204p;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class nd81 {

    /* JADX INFO: renamed from: a */
    public final SpannableStringBuilder f152705a = new SpannableStringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList f152706b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f152707c;

    /* JADX INFO: renamed from: d */
    public boolean f152708d;

    /* JADX INFO: renamed from: e */
    public String f152709e;

    /* JADX INFO: renamed from: f */
    public boolean f152710f;

    /* JADX INFO: renamed from: g */
    public int f152711g;

    public nd81() {
        new Random();
        this.f152706b = new ArrayList();
        this.f152707c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static SpannableString m64198a(Context context) {
        int color = context.getColor(R.color.gray_70);
        SpannableString spannableString = new SpannableString("  •  ");
        spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public final int m64199b(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f152706b;
            if (i2 < arrayList.size()) {
                int length = ((CharSequence) arrayList.get(i2)).length() + ((this.f152708d || i2 > 0) ? ((CharSequence) this.f152707c.get(i2)).length() + i3 : i3);
                if (length >= i) {
                    break;
                }
                i2++;
                i3 = length;
            } else {
                break;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final void m64200c(TextView textView, id81 id81Var) {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder = this.f152705a;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        this.f152708d = id81Var.f100982h;
        this.f152709e = id81Var.f100976b;
        this.f152710f = id81Var.f100977c;
        this.f152711g = id81Var.f100978d;
        textView.setGravity(id81Var.f100984j ? 8388611 : 17);
        ArrayList arrayList = this.f152706b;
        arrayList.clear();
        Context context = textView.getContext();
        List list = id81Var.f100979e;
        List listSubList = list.subList(0, Math.min(id81Var.f100983i, list.size()));
        int color = context.getColor(R.color.gray_70);
        int color2 = context.getColor(R.color.white);
        int color3 = context.getColor(R.color.gray_30);
        Iterator it = listSubList.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            hd81 hd81Var = (hd81) it.next();
            boolean z = hd81Var.f90076d;
            boolean z2 = hd81Var.f90075c;
            int i3 = z ? color : color3;
            int i4 = z ? color2 : color3;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (id81Var.f100980f) {
                SpannableString spannableString = new SpannableString(s571.m77250i(hd81Var.f90074b, " "));
                spannableString.setSpan(new ForegroundColorSpan(i4), 0, spannableString.length(), 33);
                spannableStringBuilder2.append((CharSequence) spannableString);
            }
            if (id81Var.f100981g && z2) {
                str = "  ";
            }
            SpannableString spannableString2 = new SpannableString(s571.m77250i(str, hd81Var.f90073a));
            if (!id81Var.f100981g || z2 == 0) {
                i = i3;
                i2 = 0;
            } else {
                int textSize = (int) textView.getTextSize();
                tc41 tc41Var = new tc41(context, vc41.HEART_ACTIVE, textSize);
                i = i3;
                tc41Var.m80417b(i);
                i2 = 0;
                tc41Var.setBounds(0, 0, textSize, textSize);
                spannableString2.setSpan(new ImageSpan(tc41Var, 1), 0, 1, 18);
            }
            spannableString2.setSpan(new ForegroundColorSpan(i), i2, spannableString2.length(), 33);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            arrayList.add(spannableStringBuilder2);
            it = it;
            color = color;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.f152707c;
        arrayList2.clear();
        Context context2 = textView.getContext();
        int i5 = 0;
        while (i5 < size) {
            if (this.f152708d) {
                int color4 = context2.getColor(R.color.white);
                SpannableString spannableString3 = new SpannableString((i5 == 0 ? "" : "  ") + (i5 + 1) + ". ");
                spannableString3.setSpan(new ForegroundColorSpan(color4), 0, spannableString3.length(), 17);
                arrayList2.add(spannableString3);
            } else {
                arrayList2.add(m64198a(context2));
            }
            i5++;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (id81Var.f100982h || i6 > 0) {
                spannableStringBuilder.append((CharSequence) arrayList2.get(i6));
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i6));
        }
    }
}
