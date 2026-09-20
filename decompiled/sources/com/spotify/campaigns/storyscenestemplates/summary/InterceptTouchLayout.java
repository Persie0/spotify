package com.spotify.campaigns.storyscenestemplates.summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import p204p.eh00;
import p204p.wv30;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/campaigns/storyscenestemplates/summary/InterceptTouchLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/w2a1;", "e", "Lp/eh00;", "getUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates", "()Lp/eh00;", "setUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates", "(Lp/eh00;)V", "userLeftClickListener", "src_main_java_com_spotify_campaigns_storyscenestemplates-storyscenestemplates"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class InterceptTouchLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f3118a;

    /* JADX INFO: renamed from: b */
    public boolean f3119b;

    /* JADX INFO: renamed from: c */
    public float f3120c;

    /* JADX INFO: renamed from: d */
    public float f3121d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public eh00 userLeftClickListener;

    public InterceptTouchLayout(Context context) {
        super(context);
        this.userLeftClickListener = wv30.f255370X;
    }

    /* JADX INFO: renamed from: getUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates, reason: from getter */
    public final eh00 getUserLeftClickListener() {
        return this.userLeftClickListener;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3118a && 2 == motionEvent.getAction()) {
            this.f3119b = true;
            this.f3118a = false;
            this.f3120c = motionEvent.getX();
            this.f3121d = motionEvent.getY();
        }
        if (!this.f3118a && motionEvent.getAction() == 0) {
            this.f3120c = motionEvent.getX();
            this.f3121d = motionEvent.getY();
            this.f3118a = true;
        }
        if (1 == motionEvent.getAction()) {
            if ((motionEvent.getX() == this.f3120c && motionEvent.getY() == this.f3121d && motionEvent.getX() <= ((float) (((double) getWidth()) * 0.5d)) && this.f3118a && !this.f3119b) || (motionEvent.getX() == this.f3120c && motionEvent.getY() == this.f3121d && this.f3119b && motionEvent.getX() <= ((float) (((double) getWidth()) * 0.5d)))) {
                this.userLeftClickListener.invoke();
            }
            this.f3118a = false;
            this.f3119b = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: setUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates */
    public final void m4194x142e692(eh00 eh00Var) {
        this.userLeftClickListener = eh00Var;
    }

    public InterceptTouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.userLeftClickListener = wv30.f255370X;
    }

    public InterceptTouchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.userLeftClickListener = wv30.f255370X;
    }
}
