package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
import p204p.dmj;

/* JADX INFO: loaded from: classes3.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f785c = 0;

    /* JADX INFO: renamed from: a */
    public final dmj f786a;

    /* JADX INFO: renamed from: b */
    public final dmj f787b;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f786a);
        removeCallbacks(this.f787b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f786a);
        removeCallbacks(this.f787b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p.dmj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.dmj] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.f786a = new Runnable(this) { // from class: p.dmj

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ContentLoadingProgressBar f50542b;

            {
                this.f50542b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f50542b;
                switch (i2) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.f785c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.f785c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f787b = new Runnable(this) { // from class: p.dmj

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ContentLoadingProgressBar f50542b;

            {
                this.f50542b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f50542b;
                switch (i3) {
                    case 0:
                        int i4 = ContentLoadingProgressBar.f785c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i5 = ContentLoadingProgressBar.f785c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }
}
