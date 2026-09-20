package com.spotify.encoreconsumermobile.elements.entitymetadata;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2652zj;
import p204p.dkw0;
import p204p.g6f;
import p204p.g9k;
import p204p.gtq;
import p204p.h6f;
import p204p.kmv;
import p204p.lau;
import p204p.mec1;
import p204p.mq8;
import p204p.mqo0;
import p204p.oqs;
import p204p.vtg1;
import p204p.wg61;
import p204p.wj50;
import p204p.wl51;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/entitymetadata/EntityMetadataView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroupView;", "b", "Lp/fr70;", "getBadgeGroupView", "()Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroupView;", "badgeGroupView", "Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBarView;", "c", "getPlayProgressBarView", "()Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBarView;", "playProgressBarView", "src_main_java_com_spotify_encoreconsumermobile_elements_entitymetadata-entitymetadata"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EntityMetadataView extends FrameLayout implements oqs {

    /* JADX INFO: renamed from: a */
    public final MetadataRow f3651a;

    /* JADX INFO: renamed from: b */
    public final wg61 f3652b;

    /* JADX INFO: renamed from: c */
    public final wg61 f3653c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3654d;

    /* JADX INFO: renamed from: e */
    public final int f3655e;

    /* JADX INFO: renamed from: f */
    public dkw0 f3656f;

    public EntityMetadataView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final BadgeGroupView getBadgeGroupView() {
        return (BadgeGroupView) this.f3652b.getValue();
    }

    private final PlayProgressBarView getPlayProgressBarView() {
        return (PlayProgressBarView) this.f3653c.getValue();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(kmv kmvVar) {
        mq8 mq8Var = kmvVar.f124213a;
        Iterable iterable = kmvVar.f124214b;
        if (iterable == null) {
            iterable = lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!wl51.m88460J0((String) obj)) {
                arrayList.add(obj);
            }
        }
        mqo0 mqo0Var = kmvVar.f124215c;
        boolean z = kmvVar.f124216d;
        dkw0 dkw0Var = new dkw0(mq8Var, arrayList, mqo0Var, z);
        dkw0 dkw0Var2 = this.f3656f;
        if (dkw0Var.equals(dkw0Var2)) {
            return;
        }
        Throwable th = null;
        boolean zM88271j = wj50.m88271j(dkw0Var2 != null ? dkw0Var2.f50058e : null, dkw0Var.f50058e);
        ArrayList arrayList2 = this.f3654d;
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        if (zM88271j) {
            if (!wj50.m88271j(dkw0Var2.f50054a, mq8Var) && mq8Var != null) {
                getBadgeGroupView().mo2820d(mq8Var);
            }
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                String str = (String) obj2;
                if (!wj50.m88271j(str, dkw0Var2.f50055b.get(i))) {
                    ((EncoreTextView) arrayList2.get(i)).setText(str);
                }
                i = i2;
            }
            if (!wj50.m88271j(dkw0Var2.f50056c, mqo0Var) && mqo0Var != null) {
                getPlayProgressBarView().mo2820d(mqo0Var);
            }
            if (dkw0Var2.f50057d != z) {
                setAlpha(z ? 0.3f : 1.0f);
            }
        } else {
            MetadataRow metadataRow = this.f3651a;
            metadataRow.m9628B();
            int separatorColor = metadataRow.getSeparatorColor();
            int i3 = this.f3655e;
            if (separatorColor != i3) {
                metadataRow.setSeparatorColor(i3);
            }
            if (mq8Var != null) {
                getBadgeGroupView().mo2820d(mq8Var);
                MetadataRow.m9627x(metadataRow, getBadgeGroupView(), false);
            }
            int i4 = 0;
            for (Object obj3 : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    Throwable th2 = th;
                    h6f.m46722S();
                    throw th2;
                }
                String str2 = (String) obj3;
                EncoreTextView encoreTextView = (EncoreTextView) g6f.m43747t0(i4, arrayList2);
                if (encoreTextView == null) {
                    EncoreTextView encoreTextView2 = new EncoreTextView(new g9k(getContext(), R.style.MetadataTextStyle), null, 0, 6, null);
                    encoreTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    WeakHashMap weakHashMap = mec1.f142677a;
                    encoreTextView2.setId(View.generateViewId());
                    arrayList2.add(i4, encoreTextView2);
                    encoreTextView = encoreTextView2;
                }
                encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, R.attr.textBase));
                if (!wj50.m88271j(encoreTextView.getText(), str2)) {
                    encoreTextView.setText(str2);
                }
                MetadataRow.m9627x(metadataRow, encoreTextView, i4 != 0);
                th = th;
                i4 = i5;
            }
            mqo0 mqo0Var2 = dkw0Var.f50056c;
            if (mqo0Var2 != null) {
                PlayProgressBarView playProgressBarView = getPlayProgressBarView();
                playProgressBarView.mo2820d(mqo0Var2);
                playProgressBarView.setVisibility(0);
                if (!dkw0Var.f50055b.isEmpty() && mqo0Var2 != null && mqo0Var2.f146324a && mqo0Var2.f146327d != 3) {
                    z2 = true;
                }
                MetadataRow.m9627x(metadataRow, playProgressBarView, z2);
            }
            setAlpha(z ? 0.3f : 1.0f);
        }
        this.f3656f = dkw0Var;
    }

    public EntityMetadataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EntityMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MetadataRow metadataRow = new MetadataRow(context, null, 0, 6, null);
        metadataRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        WeakHashMap weakHashMap = mec1.f142677a;
        metadataRow.setId(View.generateViewId());
        addView(metadataRow);
        this.f3651a = metadataRow;
        this.f3652b = new wg61(new C2652zj(context, 21));
        this.f3653c = new wg61(new C2652zj(context, 22));
        this.f3654d = new ArrayList();
        this.f3655e = vtg1.m86387n(this, R.attr.textBase);
    }

    public /* synthetic */ EntityMetadataView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
