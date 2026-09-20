package com.spotify.mainlayout.p106ui.view.gradient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import p204p.a450;
import p204p.b450;
import p204p.bqs;
import p204p.g6f;
import p204p.i6f;
import p204p.iqs;
import p204p.m9f;
import p204p.pwb0;
import p204p.qr60;
import p204p.spi0;
import p204p.t350;
import p204p.y2u0;
import p204p.yzl;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R/\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR/\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/mainlayout/ui/view/gradient/MainLayoutGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "<set-?>", "a", "Ljava/lang/Object;", "getTopColor", "()Ljava/lang/Integer;", "setTopColor", "(Ljava/lang/Integer;)V", "topColor", "b", "getBottomColor", "setBottomColor", "bottomColor", "Lp/bqs;", "c", "getEasing", "()Lp/bqs;", "setEasing", "(Lp/bqs;)V", "easing", "src_main_java_com_spotify_mainlayout_ui_view-view"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MainLayoutGradientView extends View {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qr60[] f5424d = {new spi0(MainLayoutGradientView.class, "topColor", "getTopColor()Ljava/lang/Integer;", 0), new spi0(MainLayoutGradientView.class, "bottomColor", "getBottomColor()Ljava/lang/Integer;", 0), new spi0(MainLayoutGradientView.class, "easing", "getEasing()Landroidx/compose/animation/core/Easing;", 0)};

    /* JADX INFO: renamed from: a */
    public final pwb0 f5425a;

    /* JADX INFO: renamed from: b */
    public final pwb0 f5426b;

    /* JADX INFO: renamed from: c */
    public final pwb0 f5427c;

    public MainLayoutGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5425a = new pwb0(this, 0);
        this.f5426b = new pwb0(this, 1);
        this.f5427c = new pwb0(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2u0.f268683e, 0, 0);
        setTopColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0)));
        setBottomColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0)));
        int i = typedArrayObtainStyledAttributes.getInt(1, -1);
        setEasing(i != 0 ? i != 1 ? iqs.f104842d : new yzl(0.51f, 0.0f, 0.26f, 1.0f) : iqs.f104841c);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static final void m13405a(MainLayoutGradientView mainLayoutGradientView) {
        Integer topColor = mainLayoutGradientView.getTopColor();
        if (topColor != null) {
            int iIntValue = topColor.intValue();
            Integer bottomColor = mainLayoutGradientView.getBottomColor();
            if (bottomColor != null) {
                int iIntValue2 = bottomColor.intValue();
                bqs easing = mainLayoutGradientView.getEasing();
                if (easing == null) {
                    return;
                }
                float f = 20;
                b450 b450Var = new b450(0, 20, 1);
                ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
                Iterator it = b450Var.iterator();
                while (((a450) it).f12141c) {
                    arrayList.add(Float.valueOf(easing.mo30276a(((t350) it).nextInt() / f)));
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(m9f.m61216d(iIntValue, iIntValue2, ((Number) it2.next()).floatValue())));
                }
                mainLayoutGradientView.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, g6f.m43726i1(arrayList2)));
            }
        }
    }

    public final Integer getBottomColor() {
        qr60 qr60Var = f5424d[1];
        return (Integer) this.f5426b.f61172a;
    }

    public final bqs getEasing() {
        qr60 qr60Var = f5424d[2];
        return (bqs) this.f5427c.f61172a;
    }

    public final Integer getTopColor() {
        qr60 qr60Var = f5424d[0];
        return (Integer) this.f5425a.f61172a;
    }

    public final void setBottomColor(Integer num) {
        this.f5426b.m39516c(f5424d[1], this, num);
    }

    public final void setEasing(bqs bqsVar) {
        this.f5427c.m39516c(f5424d[2], this, bqsVar);
    }

    public final void setTopColor(Integer num) {
        this.f5425a.m39516c(f5424d[0], this, num);
    }
}
