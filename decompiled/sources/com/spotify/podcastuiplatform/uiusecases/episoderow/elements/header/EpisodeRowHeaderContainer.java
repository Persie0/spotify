package com.spotify.podcastuiplatform.uiusecases.episoderow.elements.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2042k7;
import p204p.egp;
import p204p.fgp;
import p204p.g8w;
import p204p.h8w;
import p204p.i8w;
import p204p.x09;
import p204p.yyb1;
import p204p.zyb1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/podcastuiplatform/uiusecases/episoderow/elements/header/EpisodeRowHeaderContainer;", "Landroid/widget/FrameLayout;", "Lp/h8w;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/i8w;", "viewContext", "Lp/w2a1;", "setViewContext", "(Lp/i8w;)V", "", x09.f256832d, "setEnabled", "(Z)V", "src_main_java_com_spotify_podcastuiplatform_uiusecases-uiusecases"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EpisodeRowHeaderContainer extends FrameLayout implements h8w {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f6495a;

    /* JADX INFO: renamed from: b */
    public i8w f6496b;

    public EpisodeRowHeaderContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m19487a(h8w h8wVar, i8w i8wVar) {
        if (h8wVar instanceof fgp) {
            ((fgp) h8wVar).setViewContext(new egp(i8wVar.f99851a));
        } else if (h8wVar instanceof zyb1) {
            ((zyb1) h8wVar).setViewContext(new yyb1(i8wVar.f99851a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, p.gr50] */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        g8w g8wVar = (g8w) obj;
        ?? r0 = this.f6495a;
        if (r0 != 0) {
            r0.mo2820d(g8wVar);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        C2042k7 c2042k7 = new C2042k7(this, 8);
        while (c2042k7.hasNext()) {
            ((View) c2042k7.next()).setEnabled(enabled);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, p.h8w] */
    public final void setViewContext(i8w viewContext) {
        this.f6496b = viewContext;
        ?? r0 = this.f6495a;
        if (r0 != 0) {
            m19487a(r0, viewContext);
        }
    }

    public EpisodeRowHeaderContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EpisodeRowHeaderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public /* synthetic */ EpisodeRowHeaderContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
