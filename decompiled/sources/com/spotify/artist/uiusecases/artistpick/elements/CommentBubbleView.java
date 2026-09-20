package com.spotify.artist.uiusecases.artistpick.elements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.h66;
import p204p.m66;
import p204p.oqs;
import p204p.ucf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/artist/uiusecases/artistpick/elements/CommentBubbleView;", "", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/spotify/encoreconsumermobile/elements/artwork/ArtworkView;", "a", "Lcom/spotify/encoreconsumermobile/elements/artwork/ArtworkView;", "getCommentImage", "()Lcom/spotify/encoreconsumermobile/elements/artwork/ArtworkView;", "commentImage", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getArtistComment", "()Landroid/widget/TextView;", "artistComment", "src_main_java_com_spotify_artist_uiusecases_artistpick-artistpick"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CommentBubbleView extends FrameLayout implements oqs {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ArtworkView commentImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TextView artistComment;

    /* JADX INFO: renamed from: c */
    public final View f3003c;

    public CommentBubbleView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(ucf ucfVar) {
        boolean z = ucfVar.f229028c;
        View view = this.f3003c;
        TextView textView = this.artistComment;
        if (z) {
            view.setVisibility(0);
            setElevation(getResources().getDimension(R.dimen.artist_pick_comment_shadow_elevation));
            textView.setTextColor(getResources().getColor(R.color.artist_comment_text));
        } else {
            view.setVisibility(8);
            setElevation(0.0f);
            textView.setTextColor(getResources().getColor(R.color.artist_no_comment_text));
        }
        textView.setText(ucfVar.f229027b);
        this.commentImage.mo2820d(new m66(new h66(ucfVar.f229026a), false));
    }

    public final TextView getArtistComment() {
        return this.artistComment;
    }

    public final ArtworkView getCommentImage() {
        return this.commentImage;
    }

    public CommentBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CommentBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.comment_bubble, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.artist_pick_comment_shadow_margin);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, dimensionPixelSize, dimensionPixelSize);
        setLayoutParams(layoutParams);
        this.commentImage = (ArtworkView) findViewById(R.id.comment_image);
        this.artistComment = (TextView) findViewById(R.id.artist_comment);
        this.f3003c = findViewById(R.id.comment_background);
    }

    public /* synthetic */ CommentBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
