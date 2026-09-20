package com.spotify.campaigns.paragraph.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.ap4;
import p204p.atm0;
import p204p.btm0;
import p204p.edb;
import p204p.g6f;
import p204p.h6f;
import p204p.n000;
import p204p.s171;
import p204p.wl51;
import p204p.xsm0;
import p204p.ysm0;
import p204p.zj80;
import p204p.zsm0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/campaigns/paragraph/view/ParagraphView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p/atm0", "p/ysm0", "p/xsm0", "p/zsm0", "src_main_java_com_spotify_campaigns_paragraph_view-view"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ParagraphView extends AppCompatTextView {
    public ParagraphView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: t */
    public final void m4190t(SpannableStringBuilder spannableStringBuilder, atm0 atm0Var) {
        int length = spannableStringBuilder.length();
        String str = atm0Var.f19709a;
        int i = atm0Var.f19712d;
        xsm0 xsm0Var = atm0Var.f19713e;
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new s171(getContext(), atm0Var.f19710b, atm0Var.f19711c), length, spannableStringBuilder.length(), 17);
        Integer num = atm0Var.f19715g;
        if (num != null) {
            spannableStringBuilder.setSpan(new n000(getContext(), num.intValue()), length, spannableStringBuilder.length(), 17);
        }
        if (xsm0Var != null) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(m4192v(xsm0Var)), length, spannableStringBuilder.length(), 17);
        }
        xsm0 xsm0Var2 = atm0Var.f19714f;
        if (xsm0Var2 != null) {
            int iM4192v = m4192v(xsm0Var2);
            spannableStringBuilder.setSpan(Build.VERSION.SDK_INT == 29 ? ap4.m26639h(iM4192v) : new zj80(iM4192v), length, spannableStringBuilder.length(), 17);
        }
        if (Color.alpha(i) > 0) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(i), length, spannableStringBuilder.length(), 17);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: u */
    public final void m4191u(ysm0 ysm0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        atm0 atm0Var = ysm0Var.f275841a;
        ?? r10 = ysm0Var.f275842b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : r10) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            atm0 atm0Var2 = (atm0) obj;
            String str = String.format(Locale.ENGLISH, "$%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            int iM88458H0 = wl51.m88458H0(atm0Var.f19709a, str, 0, false, 6);
            if (iM88458H0 != -1) {
                arrayList.add(new zsm0(iM88458H0, str.length() + iM88458H0, atm0Var2));
            }
            i = i2;
        }
        List<zsm0> listM43728j1 = g6f.m43728j1(g6f.m43711Y0(arrayList, new btm0(0)));
        int i3 = 0;
        for (zsm0 zsm0Var : listM43728j1) {
            m4190t(spannableStringBuilder, atm0.m27146c(atm0Var, atm0Var.f19709a.substring(i3, zsm0Var.f285976a)));
            m4190t(spannableStringBuilder, zsm0Var.f285978c);
            i3 = zsm0Var.f285977b;
        }
        zsm0 zsm0Var2 = (zsm0) g6f.m43689C0(listM43728j1);
        int i4 = zsm0Var2 != null ? zsm0Var2.f285977b : 0;
        if (i4 < atm0Var.f19709a.length()) {
            m4190t(spannableStringBuilder, atm0.m27146c(atm0Var, atm0Var.f19709a.substring(i4)));
        }
        setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v */
    public final int m4192v(xsm0 xsm0Var) {
        float fApplyDimension = xsm0Var.f265628a;
        int iM38547C = edb.m38547C(xsm0Var.f265629b);
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                fApplyDimension = TypedValue.applyDimension(1, fApplyDimension, getResources().getDisplayMetrics());
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fApplyDimension = TypedValue.applyDimension(2, fApplyDimension, getResources().getDisplayMetrics());
            }
        }
        return (int) fApplyDimension;
    }

    public ParagraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ParagraphView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
