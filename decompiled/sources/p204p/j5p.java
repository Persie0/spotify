package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.share.ShareButton;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class j5p implements ovf {

    /* JADX INFO: renamed from: L0 */
    public final xir f109031L0;

    /* JADX INFO: renamed from: M0 */
    public final String f109032M0;

    /* JADX INFO: renamed from: N0 */
    public final int f109033N0;

    /* JADX INFO: renamed from: O0 */
    public final Drawable f109034O0;

    /* JADX INFO: renamed from: P0 */
    public final int f109035P0;

    /* JADX INFO: renamed from: Q0 */
    public final Typeface f109036Q0;

    /* JADX INFO: renamed from: R0 */
    public final Typeface f109037R0;

    /* JADX INFO: renamed from: S0 */
    public int f109038S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f109039T0;

    /* JADX INFO: renamed from: U0 */
    public c9k f109040U0;

    /* JADX INFO: renamed from: V0 */
    public di41 f109041V0;

    /* JADX INFO: renamed from: W0 */
    public List f109042W0;

    /* JADX INFO: renamed from: X */
    public qe70 f109043X;

    /* JADX INFO: renamed from: X0 */
    public int f109044X0;

    /* JADX INFO: renamed from: Y */
    public qe70 f109045Y;

    /* JADX INFO: renamed from: Y0 */
    public ArtworkView f109046Y0;

    /* JADX INFO: renamed from: Z */
    public final r96 f109047Z;

    /* JADX INFO: renamed from: Z0 */
    public ArtworkView f109048Z0;

    /* JADX INFO: renamed from: a */
    public final Context f109049a;

    /* JADX INFO: renamed from: a1 */
    public d7i f109050a1;

    /* JADX INFO: renamed from: b */
    public final boolean f109051b;

    /* JADX INFO: renamed from: c */
    public final C2652zj f109052c;

    /* JADX INFO: renamed from: d */
    public final u12 f109053d;

    /* JADX INFO: renamed from: e */
    public final d03 f109054e;

    /* JADX INFO: renamed from: f */
    public final u4i f109055f;

    /* JADX INFO: renamed from: g */
    public final MultiArtistAvatarView f109056g;

    /* JADX INFO: renamed from: h */
    public final MultiArtistAvatarView f109057h;

    /* JADX INFO: renamed from: i */
    public final c7j f109058i;

    /* JADX INFO: renamed from: t */
    public qe70 f109059t;

    public j5p(Context context, e940 e940Var, boolean z) {
        C2652zj c2652zj = new C2652zj(context, 6);
        this.f109049a = context;
        this.f109051b = z;
        this.f109052c = c2652zj;
        u12 u12VarM82152z = u12.m82152z(LayoutInflater.from(context));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) u12VarM82152z.f225650d;
        fn20.m42205i(u12VarM82152z);
        this.f109053d = u12VarM82152z;
        View viewM42203g = fn20.m42203g(u12VarM82152z, R.layout.concert_entity_header_content);
        int i = R.id.action_row_container;
        ViewStub viewStub = (ViewStub) vie1.m85629k(viewM42203g, R.id.action_row_container);
        if (viewStub != null) {
            int i2 = R.id.artwork;
            ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewM42203g, R.id.artwork);
            if (artworkView != null) {
                i2 = R.id.artwork_helper_space;
                Space space = (Space) vie1.m85629k(viewM42203g, R.id.artwork_helper_space);
                if (space != null) {
                    i2 = R.id.artwork_multiple;
                    MultiArtistAvatarView multiArtistAvatarView = (MultiArtistAvatarView) vie1.m85629k(viewM42203g, R.id.artwork_multiple);
                    if (multiArtistAvatarView != null) {
                        i2 = R.id.barrier_bottom;
                        if (((Barrier) vie1.m85629k(viewM42203g, R.id.barrier_bottom)) != null) {
                            i2 = R.id.barrier_end;
                            if (((Barrier) vie1.m85629k(viewM42203g, R.id.barrier_end)) != null) {
                                i2 = R.id.calendar;
                                CalendarIconView calendarIconView = (CalendarIconView) vie1.m85629k(viewM42203g, R.id.calendar);
                                if (calendarIconView != null) {
                                    i2 = R.id.concept_chips_container;
                                    ComposeView composeView = (ComposeView) vie1.m85629k(viewM42203g, R.id.concept_chips_container);
                                    if (composeView != null) {
                                        i2 = R.id.content_bottom_space;
                                        Space space2 = (Space) vie1.m85629k(viewM42203g, R.id.content_bottom_space);
                                        if (space2 != null) {
                                            i2 = R.id.content_space;
                                            Space space3 = (Space) vie1.m85629k(viewM42203g, R.id.content_space);
                                            if (space3 != null) {
                                                i2 = R.id.date;
                                                TextView textView = (TextView) vie1.m85629k(viewM42203g, R.id.date);
                                                if (textView != null) {
                                                    i2 = R.id.guideline_end;
                                                    if (((Guideline) vie1.m85629k(viewM42203g, R.id.guideline_end)) != null) {
                                                        i2 = R.id.guideline_start;
                                                        if (((Guideline) vie1.m85629k(viewM42203g, R.id.guideline_start)) != null) {
                                                            i2 = R.id.hero_artwork;
                                                            ArtworkView artworkView2 = (ArtworkView) vie1.m85629k(viewM42203g, R.id.hero_artwork);
                                                            if (artworkView2 != null) {
                                                                i2 = R.id.hero_artwork_next;
                                                                ArtworkView artworkView3 = (ArtworkView) vie1.m85629k(viewM42203g, R.id.hero_artwork_next);
                                                                if (artworkView3 != null) {
                                                                    i2 = R.id.hero_calendar;
                                                                    CalendarIconView calendarIconView2 = (CalendarIconView) vie1.m85629k(viewM42203g, R.id.hero_calendar);
                                                                    if (calendarIconView2 != null) {
                                                                        i2 = R.id.hero_gradient;
                                                                        View viewM85629k = vie1.m85629k(viewM42203g, R.id.hero_gradient);
                                                                        if (viewM85629k != null) {
                                                                            i2 = R.id.hero_subtitle;
                                                                            TextView textView2 = (TextView) vie1.m85629k(viewM42203g, R.id.hero_subtitle);
                                                                            if (textView2 != null) {
                                                                                i2 = R.id.hero_title;
                                                                                TextView textView3 = (TextView) vie1.m85629k(viewM42203g, R.id.hero_title);
                                                                                if (textView3 != null) {
                                                                                    i2 = R.id.lineup_text;
                                                                                    TextView textView4 = (TextView) vie1.m85629k(viewM42203g, R.id.lineup_text);
                                                                                    if (textView4 != null) {
                                                                                        i2 = R.id.overlay;
                                                                                        View viewM85629k2 = vie1.m85629k(viewM42203g, R.id.overlay);
                                                                                        if (viewM85629k2 != null) {
                                                                                            i2 = R.id.postfix_text;
                                                                                            TextView textView5 = (TextView) vie1.m85629k(viewM42203g, R.id.postfix_text);
                                                                                            if (textView5 != null) {
                                                                                                i2 = R.id.title;
                                                                                                TextView textView6 = (TextView) vie1.m85629k(viewM42203g, R.id.title);
                                                                                                if (textView6 != null) {
                                                                                                    i2 = R.id.venue;
                                                                                                    TextView textView7 = (TextView) vie1.m85629k(viewM42203g, R.id.venue);
                                                                                                    if (textView7 != null) {
                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewM42203g;
                                                                                                        this.f109054e = new d03(constraintLayout, viewStub, artworkView, space, multiArtistAvatarView, calendarIconView, composeView, space2, space3, textView, artworkView2, artworkView3, calendarIconView2, viewM85629k, textView2, textView3, textView4, viewM85629k2, textView5, textView6, textView7, 2);
                                                                                                        viewStub.setLayoutResource(R.layout.concert_entity_action_row);
                                                                                                        View viewInflate = viewStub.inflate();
                                                                                                        int i3 = R.id.add_to_calendar_button;
                                                                                                        EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate, R.id.add_to_calendar_button);
                                                                                                        if (encoreButton != null) {
                                                                                                            i3 = R.id.artist_chip;
                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.artist_chip);
                                                                                                            if (constraintLayout2 != null) {
                                                                                                                i3 = R.id.artist_chip_artwork;
                                                                                                                MultiArtistAvatarView multiArtistAvatarView2 = (MultiArtistAvatarView) vie1.m85629k(viewInflate, R.id.artist_chip_artwork);
                                                                                                                if (multiArtistAvatarView2 != null) {
                                                                                                                    i3 = R.id.artist_chip_title;
                                                                                                                    TextView textView8 = (TextView) vie1.m85629k(viewInflate, R.id.artist_chip_title);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i3 = R.id.barrier_buttons;
                                                                                                                        if (((Barrier) vie1.m85629k(viewInflate, R.id.barrier_buttons)) != null) {
                                                                                                                            i3 = R.id.barrier_icons;
                                                                                                                            if (((Barrier) vie1.m85629k(viewInflate, R.id.barrier_icons)) != null) {
                                                                                                                                i3 = R.id.context_menu_button;
                                                                                                                                ContextMenuButton contextMenuButton = (ContextMenuButton) vie1.m85629k(viewInflate, R.id.context_menu_button);
                                                                                                                                if (contextMenuButton != null) {
                                                                                                                                    i3 = R.id.curation_button_anchor;
                                                                                                                                    Space space4 = (Space) vie1.m85629k(viewInflate, R.id.curation_button_anchor);
                                                                                                                                    if (space4 != null) {
                                                                                                                                        i3 = R.id.guide_action_row_bottom;
                                                                                                                                        if (((Guideline) vie1.m85629k(viewInflate, R.id.guide_action_row_bottom)) != null) {
                                                                                                                                            i3 = R.id.guide_action_row_end;
                                                                                                                                            Guideline guideline = (Guideline) vie1.m85629k(viewInflate, R.id.guide_action_row_end);
                                                                                                                                            if (guideline != null) {
                                                                                                                                                i3 = R.id.guide_action_row_start;
                                                                                                                                                Guideline guideline2 = (Guideline) vie1.m85629k(viewInflate, R.id.guide_action_row_start);
                                                                                                                                                if (guideline2 != null) {
                                                                                                                                                    i3 = R.id.interested_button;
                                                                                                                                                    EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewInflate, R.id.interested_button);
                                                                                                                                                    if (encoreButton2 != null) {
                                                                                                                                                        i3 = R.id.interested_icon_button;
                                                                                                                                                        AddToButtonView addToButtonView = (AddToButtonView) vie1.m85629k(viewInflate, R.id.interested_icon_button);
                                                                                                                                                        if (addToButtonView != null) {
                                                                                                                                                            i3 = R.id.save_button;
                                                                                                                                                            EncoreButton encoreButton3 = (EncoreButton) vie1.m85629k(viewInflate, R.id.save_button);
                                                                                                                                                            if (encoreButton3 != null) {
                                                                                                                                                                i3 = R.id.save_icon_button;
                                                                                                                                                                AddToButtonView addToButtonView2 = (AddToButtonView) vie1.m85629k(viewInflate, R.id.save_icon_button);
                                                                                                                                                                if (addToButtonView2 != null) {
                                                                                                                                                                    i3 = R.id.share_button;
                                                                                                                                                                    ShareButton shareButton = (ShareButton) vie1.m85629k(viewInflate, R.id.share_button);
                                                                                                                                                                    if (shareButton != null) {
                                                                                                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                                                                                                                                        u4i u4iVar = new u4i(constraintLayout3, encoreButton, constraintLayout2, multiArtistAvatarView2, textView8, contextMenuButton, space4, guideline, guideline2, encoreButton2, addToButtonView, encoreButton3, addToButtonView2, shareButton);
                                                                                                                                                                        constraintLayout3.setId(R.id.action_row_container);
                                                                                                                                                                        this.f109055f = u4iVar;
                                                                                                                                                                        this.f109056g = multiArtistAvatarView;
                                                                                                                                                                        this.f109057h = multiArtistAvatarView2;
                                                                                                                                                                        c7j c7jVar = new c7j();
                                                                                                                                                                        c7jVar.m31736f(constraintLayout);
                                                                                                                                                                        this.f109058i = c7jVar;
                                                                                                                                                                        this.f109059t = kko.f123655Y0;
                                                                                                                                                                        this.f109043X = kko.f123653X0;
                                                                                                                                                                        this.f109045Y = bxl.f31906a1;
                                                                                                                                                                        r96 r96Var = new r96(e940Var);
                                                                                                                                                                        this.f109047Z = r96Var;
                                                                                                                                                                        int i4 = 2;
                                                                                                                                                                        this.f109031L0 = xir.m91157c(xir.m91155a(new xvo(this, 3)), xir.m91158d(new k5p(c5p.f34231h, 0), xir.m91155a(new bzo(this, i4))), xir.m91155a(new fs9(this, 29)), xir.m91158d(oet.f164536U0, xir.m91155a(new jwo(this, i4))), xir.m91158d(new k5p(d5p.f45470h, 0), xir.m91155a(new gl8(this, 28))), xir.m91155a(new j3p(this, 1)), xir.m91155a(new bco(this, 5)), xir.m91155a(new k1n(this, 7)), xir.m91155a(new rc9(this, 29)), xir.m91155a(new f0m(this, 8)), xir.m91155a(new m3n(this, 4)), xir.m91158d(net.f153082T0, xir.m91155a(new b5p(this, 0))));
                                                                                                                                                                        this.f109032M0 = context.getResources().getString(R.string.header_lineup_text_row_postfix);
                                                                                                                                                                        this.f109033N0 = behaviorRetainingAppBarLayout.getContext().getColor(R.color.encore_header_background_default);
                                                                                                                                                                        this.f109034O0 = constraintLayout.getBackground();
                                                                                                                                                                        this.f109035P0 = constraintLayout.getPaddingTop();
                                                                                                                                                                        Typeface typefaceM82233b = u1x0.m82233b(context, R.font.spotify_mix_ui_bold);
                                                                                                                                                                        this.f109036Q0 = typefaceM82233b == null ? Typeface.DEFAULT_BOLD : typefaceM82233b;
                                                                                                                                                                        Typeface typefaceM82233b2 = u1x0.m82233b(context, R.font.spotify_mix_ui_title_extrabold);
                                                                                                                                                                        this.f109037R0 = typefaceM82233b2 == null ? Typeface.DEFAULT_BOLD : typefaceM82233b2;
                                                                                                                                                                        this.f109042W0 = lau.f131415a;
                                                                                                                                                                        this.f109046Y0 = artworkView2;
                                                                                                                                                                        this.f109048Z0 = artworkView3;
                                                                                                                                                                        fn20.m42206j(u12VarM82152z, new k6i(1, this, j5p.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, 0, 18));
                                                                                                                                                                        fn20.m42197a(u12VarM82152z, constraintLayout, textView6);
                                                                                                                                                                        Drawable f3797x0 = encoreButton.getF3797X0();
                                                                                                                                                                        if (f3797x0 != null) {
                                                                                                                                                                            int iM52464e = m52464e(6);
                                                                                                                                                                            encoreButton.setIcon(new InsetDrawable(f3797x0, iM52464e, 0, -iM52464e, 0));
                                                                                                                                                                        }
                                                                                                                                                                        artworkView.setViewContext(r96Var);
                                                                                                                                                                        artworkView2.setViewContext(r96Var);
                                                                                                                                                                        artworkView3.setViewContext(r96Var);
                                                                                                                                                                        behaviorRetainingAppBarLayout.addOnAttachStateChangeListener(new ay1(this, 5));
                                                                                                                                                                        constraintLayout.addOnLayoutChangeListener(new a5p(this, 0));
                                                                                                                                                                        behaviorRetainingAppBarLayout.m1526a(new uze(this, 5));
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM42203g.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: a */
    public static final void m52461a(j5p j5pVar) {
        u4i u4iVar = j5pVar.f109055f;
        Guideline guideline = (Guideline) u4iVar.f226731t;
        EncoreButton encoreButton = (EncoreButton) u4iVar.f226725d;
        TextView textView = (TextView) u4iVar.f226728g;
        ConstraintLayout constraintLayout = (ConstraintLayout) u4iVar.f226724c;
        int left = guideline.getLeft() - ((Guideline) u4iVar.f226719X).getLeft();
        if (left <= 0) {
            return;
        }
        h6j h6jVar = (h6j) constraintLayout.getLayoutParams();
        h6j h6jVar2 = (h6j) textView.getLayoutParams();
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add((Space) u4iVar.f226730i);
        if (encoreButton.getVisibility() == 0) {
            ro80VarM44508o.add(encoreButton);
        }
        ro80VarM44508o.add((ShareButton) u4iVar.f226718L0);
        ro80VarM44508o.add((ContextMenuButton) u4iVar.f226729h);
        ListIterator listIterator = geg1.m44506m(ro80VarM44508o).listIterator(0);
        int marginEnd = 0;
        while (true) {
            qo80 qo80Var = (qo80) listIterator;
            if (!qo80Var.hasNext()) {
                break;
            }
            h6j h6jVar3 = (h6j) ((View) qo80Var.next()).getLayoutParams();
            marginEnd += h6jVar3.getMarginEnd() + h6jVar3.getMarginStart() + ((ViewGroup.MarginLayoutParams) h6jVar3).width;
        }
        int marginStart = ((left - h6jVar.getMarginStart()) - marginEnd) - (constraintLayout.getPaddingEnd() + (h6jVar2.getMarginStart() + (constraintLayout.getPaddingStart() + j5pVar.f109057h.getLayoutParams().width)));
        textView.setMaxWidth(marginStart >= 0 ? marginStart : 0);
    }

    /* JADX INFO: renamed from: g */
    public static void m52462g(ArtworkView artworkView, String str) {
        artworkView.mo2820d(new z66(new h66(str, new a66(0.0f)), false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: b */
    public final es5 m52463b(d7i d7iVar) {
        ArrayList arrayList;
        String strM43753y0;
        boolean z = d7iVar.f46216q;
        List list = d7iVar.f46208i;
        if (z) {
            if (list.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    String str = (String) obj;
                    String str2 = (String) g6f.m43747t0(i, d7iVar.f46207h);
                    String str3 = (String) g6f.m43747t0(i, d7iVar.f46210k);
                    q6i q6iVar = (wl51.m88460J0(str) || str2 == null || wl51.m88460J0(str2) || str3 == null || wl51.m88460J0(str3)) ? null : new q6i(str, str2, str3);
                    if (q6iVar != null) {
                        arrayList2.add(q6iVar);
                    }
                    i = i2;
                }
                if (arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null) {
                String strM43753y1 = g6f.m43753y0(arrayList, ", ", null, null, kko.f123650V0, 30);
                int size = arrayList.size();
                if (size == 1) {
                    strM43753y0 = ((q6i) g6f.m43741q0(arrayList)).f185825a;
                } else if (size != 2) {
                    String str4 = ((q6i) g6f.m43741q0(arrayList)).f185825a;
                    int size2 = arrayList.size() - 1;
                    strM43753y0 = klh.m56834f(str4, " ", this.f109049a.getResources().getQuantityString(R.plurals.artist_chip_more_artists, size2, Integer.valueOf(size2)));
                } else {
                    strM43753y0 = g6f.m43753y0(arrayList, ", ", null, null, kko.f123651W0, 30);
                }
                return new es5(strM43753y1, strM43753y0, arrayList);
            }
        }
        return null;
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        ((BackButtonView) this.f109053d.f225652f).mo2821c(new u4p(3, gh00Var));
        u4i u4iVar = this.f109055f;
        ((ShareButton) u4iVar.f226718L0).mo2821c(new f5p(gh00Var, this, 0));
        ((EncoreButton) u4iVar.f226725d).setOnClickListener(new jxo(18, gh00Var));
        ((ContextMenuButton) u4iVar.f226729h).mo2821c(new f5p(gh00Var, this, 1));
        if (this.f109051b) {
            int i = 2;
            ((EncoreButton) u4iVar.f226727f).setOnClickListener(new e5p(gh00Var, this, i));
            ((AddToButtonView) u4iVar.f226721Z).mo2821c(new f5p(gh00Var, this, i));
        } else {
            int i2 = 3;
            ((EncoreButton) u4iVar.f226726e).setOnClickListener(new e5p(gh00Var, this, i2));
            ((AddToButtonView) u4iVar.f226720Y).mo2821c(new f5p(gh00Var, this, i2));
        }
        ((ConstraintLayout) u4iVar.f226724c).setOnClickListener(new e5p(this, gh00Var));
        d03 d03Var = this.f109054e;
        ((TextView) d03Var.f43717P0).setOnClickListener(new e5p(gh00Var, this, 0));
        ((TextView) d03Var.f43719R0).setOnClickListener(new e5p(gh00Var, this, 1));
        this.f109059t = new u4p(1, gh00Var);
        this.f109043X = new u4p(2, gh00Var);
        this.f109045Y = new aog(20, gh00Var);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        d7i d7iVar = (d7i) obj;
        this.f109050a1 = d7iVar;
        this.f109031L0.m91159e(d7iVar);
    }

    /* JADX INFO: renamed from: e */
    public final int m52464e(int i) {
        return q3d0.m72083N(i * this.f109049a.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: f */
    public final void m52465f(boolean z) {
        Context context = this.f109049a;
        int iM52464e = z ? m52464e(16) : context.getResources().getDimensionPixelSize(R.dimen.header_action_row_start_margin);
        int iM52464e2 = z ? m52464e(16) : context.getResources().getDimensionPixelSize(R.dimen.header_action_row_end_margin);
        u4i u4iVar = this.f109055f;
        Guideline guideline = (Guideline) u4iVar.f226719X;
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar = (h6j) layoutParams;
        h6jVar.f88129a = iM52464e;
        h6jVar.f88131b = -1;
        h6jVar.f88133c = -1.0f;
        guideline.setLayoutParams(h6jVar);
        Guideline guideline2 = (Guideline) u4iVar.f226731t;
        ViewGroup.LayoutParams layoutParams2 = guideline2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar2 = (h6j) layoutParams2;
        h6jVar2.f88129a = -1;
        h6jVar2.f88131b = iM52464e2;
        h6jVar2.f88133c = -1.0f;
        guideline2.setLayoutParams(h6jVar2);
        ConstraintLayout constraintLayout = (ConstraintLayout) u4iVar.f226724c;
        ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar3 = (h6j) layoutParams3;
        h6jVar3.setMarginStart(z ? 0 : m52464e(12));
        constraintLayout.setLayoutParams(h6jVar3);
    }

    @Override // p204p.clc1
    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.f109053d.f225650d;
    }

    /* JADX INFO: renamed from: i */
    public final void m52466i() {
        di41 di41Var = this.f109041V0;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        c9k c9kVar = this.f109040U0;
        if (c9kVar != null && this.f109039T0 && this.f109042W0.size() >= 2 && ((Boolean) this.f109052c.invoke()).booleanValue()) {
            ArtworkView artworkView = this.f109048Z0;
            List list = this.f109042W0;
            m52462g(artworkView, (String) list.get((this.f109044X0 + 1) % list.size()));
            this.f109046Y0.setAlpha(1.0f);
            this.f109046Y0.setVisibility(0);
            this.f109048Z0.setAlpha(0.0f);
            this.f109048Z0.setVisibility(0);
            this.f109041V0 = x0h1.m89578u(c9kVar, null, 0, new r2m(this, fbkVar, 16), 3);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m52467j(boolean z) {
        di41 di41Var = this.f109041V0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f109041V0 = null;
        d03 d03Var = this.f109054e;
        ArtworkView artworkView = (ArtworkView) d03Var.f43723Y;
        ArtworkView artworkView2 = (ArtworkView) d03Var.f43723Y;
        ArtworkView artworkView3 = (ArtworkView) d03Var.f43724Z;
        artworkView.animate().cancel();
        artworkView3.animate().cancel();
        if (z) {
            artworkView2.setAlpha(1.0f);
            artworkView3.setAlpha(0.0f);
            artworkView3.setVisibility(8);
            this.f109046Y0 = artworkView2;
            this.f109048Z0 = artworkView3;
            this.f109044X0 = 0;
            if (this.f109042W0.isEmpty()) {
                return;
            }
            m52462g(artworkView2, (String) g6f.m43741q0(this.f109042W0));
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m52468m(int i) {
        TypedValue typedValue = new TypedValue();
        this.f109049a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: q */
    public final void m52469q() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f109054e.f43726b;
        boolean z = this.f109039T0;
        int i = this.f109035P0;
        if (!z) {
            i += this.f109038S0;
        }
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), i, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
    }

    /* JADX INFO: renamed from: r */
    public final void m52470r(c7i c7iVar) {
        int iM72083N;
        int iM52464e;
        d03 d03Var = this.f109054e;
        ConstraintLayout constraintLayout = (ConstraintLayout) d03Var.f43726b;
        View view = (View) d03Var.f43714M0;
        ArtworkView artworkView = (ArtworkView) d03Var.f43723Y;
        int width = constraintLayout.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        Context context = this.f109049a;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : context.getResources().getDisplayMetrics().widthPixels;
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.screenWidthDp >= 600) {
            iM72083N = q3d0.m72083N((iIntValue * 0.75f) / 1.7777778f);
            int iM72083N2 = q3d0.m72083N(configuration.screenHeightDp * context.getResources().getDisplayMetrics().density * 0.5f);
            if (iM72083N > iM72083N2) {
                iM72083N = iM72083N2;
            }
        } else {
            iM72083N = q3d0.m72083N(iIntValue / 1.13f);
        }
        if (artworkView.getLayoutParams().height != iM72083N) {
            ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            h6j h6jVar = (h6j) layoutParams;
            ((ViewGroup.MarginLayoutParams) h6jVar).height = iM72083N;
            artworkView.setLayoutParams(h6jVar);
        }
        int iM38547C = edb.m38547C(c7iVar.f34907e);
        if (iM38547C == 0) {
            iM52464e = m52464e(134);
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iM52464e = m52464e(164);
        }
        if (view.getLayoutParams().height != iM52464e) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            h6j h6jVar2 = (h6j) layoutParams2;
            ((ViewGroup.MarginLayoutParams) h6jVar2).height = iM52464e;
            view.setLayoutParams(h6jVar2);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m52471t(String str) {
        d03 d03Var = this.f109054e;
        int width = ((TextView) d03Var.f43716O0).getWidth();
        if (width <= 0) {
            ((TextView) d03Var.f43716O0).setMaxLines(1);
            return;
        }
        TextPaint textPaint = new TextPaint(((TextView) d03Var.f43716O0).getPaint());
        textPaint.setTextSize(TypedValue.applyDimension(2, 24, this.f109049a.getResources().getDisplayMetrics()));
        textPaint.setTypeface(((TextView) d03Var.f43716O0).getTypeface());
        ((TextView) d03Var.f43716O0).setMaxLines(textPaint.measureText(str) > ((float) width) ? 2 : 1);
    }
}
