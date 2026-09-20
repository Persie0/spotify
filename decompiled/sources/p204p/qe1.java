package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.card.EncoreCard;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class qe1 implements noc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187825a;

    /* JADX INFO: renamed from: b */
    public final xfl0 f187826b;

    public /* synthetic */ qe1(cbj cbjVar, int i) {
        this.f187825a = i;
        this.f187826b = cbjVar;
    }

    @Override // p204p.noc1
    /* JADX INFO: renamed from: a */
    public final dkv0 mo25390a(ViewGroup viewGroup) {
        switch (this.f187825a) {
            case 0:
                View viewM25591c = adn.m25591c(viewGroup, R.layout.add_on_hours_card, viewGroup, false);
                int i = R.id.add_on_button;
                EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewM25591c, R.id.add_on_button);
                if (encoreButton != null) {
                    i = R.id.text_view_add_on_subtitle;
                    EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.text_view_add_on_subtitle);
                    if (encoreTextView != null) {
                        i = R.id.text_view_add_on_title;
                        EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(viewM25591c, R.id.text_view_add_on_title);
                        if (encoreTextView2 != null) {
                            return new pe1(this, new oe1((EncoreCard) viewM25591c, encoreButton, encoreTextView, encoreTextView2, 0));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i)));
            case 1:
                View viewM25591c2 = adn.m25591c(viewGroup, R.layout.listening_hours_card, viewGroup, false);
                int i2 = R.id.image_view_calendar;
                if (((ImageView) vie1.m85629k(viewM25591c2, R.id.image_view_calendar)) != null) {
                    i2 = R.id.image_view_chevron;
                    if (((ImageView) vie1.m85629k(viewM25591c2, R.id.image_view_chevron)) != null) {
                        i2 = R.id.manage_add_ons_container;
                        RelativeLayout relativeLayout = (RelativeLayout) vie1.m85629k(viewM25591c2, R.id.manage_add_ons_container);
                        if (relativeLayout != null) {
                            i2 = R.id.progress_horizontal_add_on_hours;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) vie1.m85629k(viewM25591c2, R.id.progress_horizontal_add_on_hours);
                            if (linearProgressIndicator != null) {
                                i2 = R.id.progress_horizontal_consumed_hours;
                                LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) vie1.m85629k(viewM25591c2, R.id.progress_horizontal_consumed_hours);
                                if (linearProgressIndicator2 != null) {
                                    i2 = R.id.text_view_listened_hours;
                                    EncoreTextView encoreTextView3 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_listened_hours);
                                    if (encoreTextView3 != null) {
                                        i2 = R.id.text_view_listened_hours_left;
                                        EncoreTextView encoreTextView4 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_listened_hours_left);
                                        if (encoreTextView4 != null) {
                                            i2 = R.id.text_view_manage_add_ons;
                                            EncoreTextView encoreTextView5 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_manage_add_ons);
                                            if (encoreTextView5 != null) {
                                                i2 = R.id.text_view_progress_bar_add_on_subtitle;
                                                EncoreTextView encoreTextView6 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_progress_bar_add_on_subtitle);
                                                if (encoreTextView6 != null) {
                                                    i2 = R.id.text_view_progress_bar_subtitle;
                                                    EncoreTextView encoreTextView7 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_progress_bar_subtitle);
                                                    if (encoreTextView7 != null) {
                                                        i2 = R.id.text_view_remaining_days;
                                                        EncoreTextView encoreTextView8 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_remaining_days);
                                                        if (encoreTextView8 != null) {
                                                            i2 = R.id.text_view_subtitle;
                                                            EncoreTextView encoreTextView9 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_subtitle);
                                                            if (encoreTextView9 != null) {
                                                                i2 = R.id.text_view_title;
                                                                EncoreTextView encoreTextView10 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_title);
                                                                if (encoreTextView10 != null) {
                                                                    i2 = R.id.text_view_total_hours;
                                                                    EncoreTextView encoreTextView11 = (EncoreTextView) vie1.m85629k(viewM25591c2, R.id.text_view_total_hours);
                                                                    if (encoreTextView11 != null) {
                                                                        i2 = R.id.view_divider;
                                                                        View viewM85629k = vie1.m85629k(viewM25591c2, R.id.view_divider);
                                                                        if (viewM85629k != null) {
                                                                            i2 = R.id.view_divider2;
                                                                            View viewM85629k2 = vie1.m85629k(viewM25591c2, R.id.view_divider2);
                                                                            if (viewM85629k2 != null) {
                                                                                return new gg90(this, new x28((EncoreCard) viewM25591c2, relativeLayout, linearProgressIndicator, linearProgressIndicator2, encoreTextView3, encoreTextView4, encoreTextView5, encoreTextView6, encoreTextView7, encoreTextView8, encoreTextView9, encoreTextView10, encoreTextView11, viewM85629k, viewM85629k2, 14));
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c2.getResources().getResourceName(i2)));
            case 2:
                View viewM25591c3 = adn.m25591c(viewGroup, R.layout.request_hour_card, viewGroup, false);
                int i3 = R.id.button_top_up;
                EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewM25591c3, R.id.button_top_up);
                if (encoreButton2 != null) {
                    i3 = R.id.text_view_cta_prompt;
                    EncoreTextView encoreTextView12 = (EncoreTextView) vie1.m85629k(viewM25591c3, R.id.text_view_cta_prompt);
                    if (encoreTextView12 != null) {
                        return new evw0(this, new abs0((EncoreCard) viewM25591c3, encoreButton2, encoreTextView12, 28));
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c3.getResources().getResourceName(i3)));
            case 3:
                View viewM25591c4 = adn.m25591c(viewGroup, R.layout.subaccount_card, viewGroup, false);
                int i4 = R.id.button_top_up_cta;
                EncoreButton encoreButton3 = (EncoreButton) vie1.m85629k(viewM25591c4, R.id.button_top_up_cta);
                if (encoreButton3 != null) {
                    i4 = R.id.image_view_chevron;
                    if (((ImageView) vie1.m85629k(viewM25591c4, R.id.image_view_chevron)) != null) {
                        i4 = R.id.progress_horizontal_consumed_hours;
                        LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) vie1.m85629k(viewM25591c4, R.id.progress_horizontal_consumed_hours);
                        if (linearProgressIndicator3 != null) {
                            i4 = R.id.see_more_container;
                            RelativeLayout relativeLayout2 = (RelativeLayout) vie1.m85629k(viewM25591c4, R.id.see_more_container);
                            if (relativeLayout2 != null) {
                                i4 = R.id.text_view_listened_hours;
                                EncoreTextView encoreTextView13 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_listened_hours);
                                if (encoreTextView13 != null) {
                                    i4 = R.id.text_view_listened_hours_left;
                                    EncoreTextView encoreTextView14 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_listened_hours_left);
                                    if (encoreTextView14 != null) {
                                        i4 = R.id.text_view_progress_bar_subtitle;
                                        EncoreTextView encoreTextView15 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_progress_bar_subtitle);
                                        if (encoreTextView15 != null) {
                                            i4 = R.id.text_view_see_top_ups;
                                            EncoreTextView encoreTextView16 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_see_top_ups);
                                            if (encoreTextView16 != null) {
                                                i4 = R.id.text_view_subtitle;
                                                EncoreTextView encoreTextView17 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_subtitle);
                                                if (encoreTextView17 != null) {
                                                    i4 = R.id.text_view_title;
                                                    EncoreTextView encoreTextView18 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_title);
                                                    if (encoreTextView18 != null) {
                                                        i4 = R.id.text_view_top_up_cta_prompt;
                                                        EncoreTextView encoreTextView19 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_top_up_cta_prompt);
                                                        if (encoreTextView19 != null) {
                                                            i4 = R.id.text_view_total_hours;
                                                            EncoreTextView encoreTextView20 = (EncoreTextView) vie1.m85629k(viewM25591c4, R.id.text_view_total_hours);
                                                            if (encoreTextView20 != null) {
                                                                i4 = R.id.top_up_cta_container;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) vie1.m85629k(viewM25591c4, R.id.top_up_cta_container);
                                                                if (relativeLayout3 != null) {
                                                                    i4 = R.id.view_divider;
                                                                    View viewM85629k3 = vie1.m85629k(viewM25591c4, R.id.view_divider);
                                                                    if (viewM85629k3 != null) {
                                                                        i4 = R.id.view_divider_top_up_cta;
                                                                        View viewM85629k4 = vie1.m85629k(viewM25591c4, R.id.view_divider_top_up_cta);
                                                                        if (viewM85629k4 != null) {
                                                                            return new nr51(this, new x28((EncoreCard) viewM25591c4, encoreButton3, linearProgressIndicator3, relativeLayout2, encoreTextView13, encoreTextView14, encoreTextView15, encoreTextView16, encoreTextView17, encoreTextView18, encoreTextView19, encoreTextView20, relativeLayout3, viewM85629k3, viewM85629k4, 17));
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c4.getResources().getResourceName(i4)));
            case 4:
                View viewM25591c5 = adn.m25591c(viewGroup, R.layout.subaccount_intro_card, viewGroup, false);
                int i5 = R.id.button_top_up;
                EncoreButton encoreButton4 = (EncoreButton) vie1.m85629k(viewM25591c5, R.id.button_top_up);
                if (encoreButton4 != null) {
                    i5 = R.id.text_view_top_ups_intro;
                    EncoreTextView encoreTextView21 = (EncoreTextView) vie1.m85629k(viewM25591c5, R.id.text_view_top_ups_intro);
                    if (encoreTextView21 != null) {
                        i5 = R.id.text_view_top_ups_title;
                        EncoreTextView encoreTextView22 = (EncoreTextView) vie1.m85629k(viewM25591c5, R.id.text_view_top_ups_title);
                        if (encoreTextView22 != null) {
                            return new rr51(this, new oe1((EncoreCard) viewM25591c5, encoreButton4, encoreTextView21, encoreTextView22, 1));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c5.getResources().getResourceName(i5)));
            case 5:
                View viewM25591c6 = adn.m25591c(viewGroup, R.layout.top_ups_card, viewGroup, false);
                int i6 = R.id.button_top_up_cta;
                EncoreButton encoreButton5 = (EncoreButton) vie1.m85629k(viewM25591c6, R.id.button_top_up_cta);
                if (encoreButton5 != null) {
                    i6 = R.id.image_view_chevron;
                    if (((ImageView) vie1.m85629k(viewM25591c6, R.id.image_view_chevron)) != null) {
                        i6 = R.id.progress_horizontal_consumed_hours;
                        LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) vie1.m85629k(viewM25591c6, R.id.progress_horizontal_consumed_hours);
                        if (linearProgressIndicator4 != null) {
                            i6 = R.id.see_more_container;
                            RelativeLayout relativeLayout4 = (RelativeLayout) vie1.m85629k(viewM25591c6, R.id.see_more_container);
                            if (relativeLayout4 != null) {
                                i6 = R.id.text_view_listened_hours;
                                EncoreTextView encoreTextView23 = (EncoreTextView) vie1.m85629k(viewM25591c6, R.id.text_view_listened_hours);
                                if (encoreTextView23 != null) {
                                    i6 = R.id.text_view_listened_hours_left;
                                    EncoreTextView encoreTextView24 = (EncoreTextView) vie1.m85629k(viewM25591c6, R.id.text_view_listened_hours_left);
                                    if (encoreTextView24 != null) {
                                        i6 = R.id.text_view_see_top_ups;
                                        EncoreTextView encoreTextView25 = (EncoreTextView) vie1.m85629k(viewM25591c6, R.id.text_view_see_top_ups);
                                        if (encoreTextView25 != null) {
                                            i6 = R.id.text_view_subtitle;
                                            EncoreTextView encoreTextView26 = (EncoreTextView) vie1.m85629k(viewM25591c6, R.id.text_view_subtitle);
                                            if (encoreTextView26 != null) {
                                                i6 = R.id.text_view_title;
                                                EncoreTextView encoreTextView27 = (EncoreTextView) vie1.m85629k(viewM25591c6, R.id.text_view_title);
                                                if (encoreTextView27 != null) {
                                                    i6 = R.id.text_view_top_up_cta_prompt;
                                                    EncoreTextView encoreTextView28 = (EncoreTextView) vie1.m85629k(viewM25591c6, R.id.text_view_top_up_cta_prompt);
                                                    if (encoreTextView28 != null) {
                                                        i6 = R.id.top_up_cta_container;
                                                        RelativeLayout relativeLayout5 = (RelativeLayout) vie1.m85629k(viewM25591c6, R.id.top_up_cta_container);
                                                        if (relativeLayout5 != null) {
                                                            i6 = R.id.view_divider;
                                                            View viewM85629k5 = vie1.m85629k(viewM25591c6, R.id.view_divider);
                                                            if (viewM85629k5 != null) {
                                                                i6 = R.id.view_divider_top_up_cta;
                                                                View viewM85629k6 = vie1.m85629k(viewM25591c6, R.id.view_divider_top_up_cta);
                                                                if (viewM85629k6 != null) {
                                                                    return new w881(this, new u4i((EncoreCard) viewM25591c6, encoreButton5, linearProgressIndicator4, relativeLayout4, encoreTextView23, encoreTextView24, encoreTextView25, encoreTextView26, encoreTextView27, encoreTextView28, relativeLayout5, viewM85629k5, viewM85629k6));
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c6.getResources().getResourceName(i6)));
            default:
                View viewM25591c7 = adn.m25591c(viewGroup, R.layout.top_ups_intro_card, viewGroup, false);
                int i7 = R.id.button_top_up;
                EncoreButton encoreButton6 = (EncoreButton) vie1.m85629k(viewM25591c7, R.id.button_top_up);
                if (encoreButton6 != null) {
                    i7 = R.id.text_view_top_ups_intro;
                    EncoreTextView encoreTextView29 = (EncoreTextView) vie1.m85629k(viewM25591c7, R.id.text_view_top_ups_intro);
                    if (encoreTextView29 != null) {
                        i7 = R.id.text_view_top_ups_title;
                        EncoreTextView encoreTextView30 = (EncoreTextView) vie1.m85629k(viewM25591c7, R.id.text_view_top_ups_title);
                        if (encoreTextView30 != null) {
                            return new e981(this, new oe1((EncoreCard) viewM25591c7, encoreButton6, encoreTextView29, encoreTextView30, 2));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c7.getResources().getResourceName(i7)));
        }
    }

    @Override // p204p.noc1
    /* JADX INFO: renamed from: b */
    public final void mo25391b(dkv0 dkv0Var, moc1 moc1Var) {
        String string;
        String string2;
        int i;
        EncoreTextView encoreTextView;
        int i2;
        int i3;
        switch (this.f187825a) {
            case 0:
                pe1 pe1Var = (pe1) dkv0Var;
                re1 re1Var = (re1) moc1Var;
                oe1 oe1Var = pe1Var.f176607S0;
                ne1 ne1Var = re1Var.f198249a;
                if (ne1Var.f152892b.length() > 0) {
                    oe1Var.f164316e.setText(ne1Var.f152891a);
                    oe1Var.f164315d.setText(ne1Var.f152892b);
                    oe1Var.f164314c.setText(ne1Var.f152893c);
                }
                oe1Var.f164314c.setOnClickListener(new ViewOnClickListenerC1708bk(2, pe1Var.f176608T0, re1Var));
                return;
            case 1:
                y8w0 y8w0Var = y8w0.f270398d;
                y8w0 y8w0Var2 = y8w0.f270397c;
                gg90 gg90Var = (gg90) dkv0Var;
                sg90 sg90Var = (sg90) moc1Var;
                x28 x28Var = gg90Var.f79576S0;
                int i4 = sg90Var.f208787c;
                int i5 = sg90Var.f208786b;
                Integer num = sg90Var.f208789e;
                nu51 nu51Var = sg90Var.f208792h;
                boolean z = sg90Var.f208794j;
                long j = sg90Var.f208785a;
                n5h1 n5h1Var = sg90Var.f208791g;
                int i6 = sg90Var.f208788d;
                qu51 qu51Var = sg90Var.f208793i;
                String str = qu51Var.f192569b;
                String str2 = qu51Var.f192570c;
                String str3 = qu51Var.f192573f;
                String str4 = qu51Var.f192572e;
                if (str.length() <= 0) {
                    EncoreCard encoreCard = (EncoreCard) x28Var.f257383b;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) x28Var.f257386e;
                    EncoreTextView encoreTextView2 = (EncoreTextView) x28Var.f257388g;
                    EncoreTextView encoreTextView3 = (EncoreTextView) x28Var.f257380Y;
                    EncoreTextView encoreTextView4 = (EncoreTextView) x28Var.f257381Z;
                    Context context = encoreCard.getContext();
                    int i7 = i4 == i6 ? R.plurals.listening_hours_card_complete : R.plurals.listening_hours_card_text;
                    if (nu51Var.f158517b.length() > 0) {
                        encoreTextView4.setText(nu51Var.f158516a);
                        encoreTextView3.setText(nu51Var.f158517b);
                    } else {
                        encoreTextView4.setText(context.getString(R.string.listening_hours_card_title));
                        encoreTextView3.setText(context.getResources().getQuantityString(i7, i6, Integer.valueOf(i6)));
                    }
                    ((EncoreTextView) x28Var.f257387f).setText((i5 >= 60 || j <= 0) ? context.getString(R.string.hours_listened, Integer.valueOf(i4)) : context.getString(R.string.less_than_one_hour_listened));
                    ((EncoreTextView) x28Var.f257376L0).setVisibility(4);
                    encoreTextView2.setVisibility(0);
                    hvi0 hvi0Var = cks.f39079b;
                    long jM54449D = jwg1.m54449D(1, ils.HOURS);
                    ils ilsVar = ils.SECONDS;
                    encoreTextView2.setText(context.getString(R.string.hours_left, Integer.valueOf((int) Math.floor((cks.m33199r(jwg1.m54449D(29, ils.MINUTES), ilsVar) + (((long) (i6 * 3600)) - j)) / cks.m33199r(jM54449D, ilsVar)))));
                    linearProgressIndicator.setMax(i6 * 60);
                    linearProgressIndicator.setProgress(i5 == 0 ? 1 : i5);
                    if (n5h1Var instanceof w8w0) {
                        Resources resources = context.getResources();
                        int i8 = ((w8w0) n5h1Var).f249030c;
                        string = resources.getQuantityString(R.plurals.days_to_renew, i8, Integer.valueOf(i8));
                    } else if (n5h1Var instanceof x8w0) {
                        Resources resources2 = context.getResources();
                        int i9 = ((x8w0) n5h1Var).f259231c;
                        string = resources2.getQuantityString(R.plurals.hours_to_renew, i9, Integer.valueOf(i9));
                    } else if (n5h1Var.equals(y8w0Var2)) {
                        string = context.getString(R.string.less_than_one_hour_to_renew);
                    } else {
                        if (!n5h1Var.equals(y8w0Var)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = context.getString(R.string.trouble_getting_time_to_renewal);
                    }
                    wj50.m88279p(string);
                    ((EncoreTextView) x28Var.f257379X).setText(string);
                    return;
                }
                EncoreCard encoreCard2 = (EncoreCard) x28Var.f257383b;
                RelativeLayout relativeLayout = (RelativeLayout) x28Var.f257384c;
                EncoreTextView encoreTextView5 = (EncoreTextView) x28Var.f257388g;
                EncoreTextView encoreTextView6 = (EncoreTextView) x28Var.f257391t;
                EncoreTextView encoreTextView7 = (EncoreTextView) x28Var.f257376L0;
                EncoreTextView encoreTextView8 = (EncoreTextView) x28Var.f257380Y;
                EncoreTextView encoreTextView9 = (EncoreTextView) x28Var.f257381Z;
                EncoreTextView encoreTextView10 = (EncoreTextView) x28Var.f257390i;
                LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) x28Var.f257386e;
                LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) x28Var.f257385d;
                Context context2 = encoreCard2.getContext();
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = sg90Var.f208790f;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                int i10 = i4 == i6 ? R.plurals.listening_hours_card_complete : R.plurals.listening_hours_card_text;
                if (str.length() > 0) {
                    encoreTextView9.setText(qu51Var.f192568a);
                    encoreTextView8.setText(str);
                } else {
                    encoreTextView9.setText(context2.getString(R.string.listening_hours_card_title));
                    encoreTextView8.setText(context2.getResources().getQuantityString(i10, i6, Integer.valueOf(i6)));
                }
                ((EncoreTextView) x28Var.f257387f).setText((i5 >= 60 || j <= 0) ? context2.getString(R.string.hours_listened, Integer.valueOf(i4 + iIntValue)) : context2.getString(R.string.less_than_one_hour_listened));
                encoreTextView7.setText(context2.getString(R.string.hours_total, Integer.valueOf(i6)));
                linearProgressIndicator2.setMax(i6 * 60);
                if (i5 == 0) {
                    i5 = 1;
                }
                linearProgressIndicator2.setProgress(i5);
                if (n5h1Var instanceof w8w0) {
                    Resources resources3 = context2.getResources();
                    int i11 = z ? R.plurals.days_to_expire : R.plurals.days_to_renew;
                    int i12 = ((w8w0) n5h1Var).f249030c;
                    string2 = resources3.getQuantityString(i11, i12, Integer.valueOf(i12));
                } else if (n5h1Var instanceof x8w0) {
                    Resources resources4 = context2.getResources();
                    int i13 = z ? R.plurals.hours_to_expire : R.plurals.hours_to_renew;
                    int i14 = ((x8w0) n5h1Var).f259231c;
                    string2 = resources4.getQuantityString(i13, i14, Integer.valueOf(i14));
                } else if (n5h1Var.equals(y8w0Var2)) {
                    string2 = context2.getString(z ? R.string.less_than_one_hour_to_expire : R.string.less_than_one_hour_to_renew);
                } else {
                    if (!n5h1Var.equals(y8w0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string2 = context2.getString(R.string.trouble_getting_time_to_renewal);
                }
                wj50.m88279p(string2);
                h6j h6jVar = (h6j) linearProgressIndicator2.getLayoutParams();
                float f = i6;
                int i15 = i6 + iIntValue2;
                float f2 = i15;
                h6jVar.f88120R = f / f2;
                linearProgressIndicator2.setLayoutParams(h6jVar);
                h6j h6jVar2 = (h6j) linearProgressIndicator3.getLayoutParams();
                h6jVar2.f88120R = iIntValue2 / f2;
                linearProgressIndicator3.setLayoutParams(h6jVar2);
                ((EncoreTextView) x28Var.f257379X).setText(string2);
                if (str4.length() > 0) {
                    i = 0;
                    encoreTextView6.setVisibility(0);
                    encoreTextView6.setText(str4);
                } else {
                    i = 0;
                }
                encoreTextView7.setVisibility(4);
                encoreTextView5.setVisibility(i);
                int i16 = iIntValue * 60;
                hvi0 hvi0Var2 = cks.f39079b;
                ils ilsVar2 = ils.HOURS;
                long jM54449D2 = jwg1.m54449D(1, ilsVar2);
                ils ilsVar3 = ils.SECONDS;
                encoreTextView5.setText(context2.getString(R.string.hours_left, Integer.valueOf((int) Math.floor((cks.m33199r(jwg1.m54449D(29, ils.MINUTES), ilsVar3) + (((long) (i15 * 3600)) - (j + ((long) (iIntValue * 3600))))) / cks.m33199r(jM54449D2, ilsVar3)))));
                if ((num != null ? new cks(jwg1.m54449D(num.intValue(), ilsVar2)) : null) != null) {
                    linearProgressIndicator3.setVisibility(0);
                    linearProgressIndicator3.setMax(iIntValue2 * 60);
                    if (i16 == 0) {
                        i16 = 0;
                    }
                    linearProgressIndicator3.setProgress(i16);
                    ((View) x28Var.f257378N0).setVisibility(0);
                    if (str3.length() > 0) {
                        encoreTextView = encoreTextView10;
                        encoreTextView.setVisibility(0);
                        encoreTextView.setText(str3);
                    } else {
                        encoreTextView = encoreTextView10;
                    }
                    ((h6j) ((View) x28Var.f257377M0).getLayoutParams()).f88147j = encoreTextView.getId();
                    if (str2.length() > 0) {
                        relativeLayout.setVisibility(0);
                        ((EncoreTextView) x28Var.f257389h).setText(str2);
                        relativeLayout.setOnClickListener(new dtz(12, gg90Var.f79577T0, sg90Var));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                evw0 evw0Var = (evw0) dkv0Var;
                hvw0 hvw0Var = (hvw0) moc1Var;
                abs0 abs0Var = evw0Var.f63361S0;
                ((EncoreTextView) abs0Var.f14180d).setText(hvw0Var.f95804b);
                EncoreButton encoreButton = (EncoreButton) abs0Var.f14179c;
                encoreButton.setText(hvw0Var.f95803a);
                encoreButton.setOnClickListener(new lt7(evw0Var.f63362T0, hvw0Var, evw0Var, 14));
                return;
            case 3:
                nr51 nr51Var = (nr51) dkv0Var;
                tr51 tr51Var = (tr51) moc1Var;
                qe1 qe1Var = nr51Var.f157450T0;
                boolean z2 = tr51Var.f222987e;
                x28 x28Var2 = nr51Var.f157449S0;
                EncoreCard encoreCard3 = (EncoreCard) x28Var2.f257383b;
                EncoreTextView encoreTextView11 = (EncoreTextView) x28Var2.f257380Y;
                EncoreTextView encoreTextView12 = (EncoreTextView) x28Var2.f257388g;
                EncoreTextView encoreTextView13 = (EncoreTextView) x28Var2.f257389h;
                LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) x28Var2.f257385d;
                EncoreTextView encoreTextView14 = (EncoreTextView) x28Var2.f257381Z;
                EncoreTextView encoreTextView15 = (EncoreTextView) x28Var2.f257391t;
                EncoreTextView encoreTextView16 = (EncoreTextView) x28Var2.f257379X;
                EncoreButton encoreButton2 = (EncoreButton) x28Var2.f257384c;
                Context context3 = encoreCard3.getContext();
                int i17 = tr51Var.f222983a;
                int i18 = tr51Var.f222984b;
                mr51 mr51Var = tr51Var.f222988f;
                String str5 = mr51Var.f146426a;
                String str6 = mr51Var.f146433h;
                String str7 = mr51Var.f146427b;
                if (str5.length() > 0) {
                    encoreTextView16.setText(mr51Var.f146426a);
                    i2 = 8;
                } else {
                    i2 = 8;
                    encoreTextView16.setVisibility(8);
                }
                if (str7.length() > 0) {
                    encoreTextView15.setText(str7);
                } else {
                    encoreTextView15.setVisibility(i2);
                }
                ((EncoreTextView) x28Var2.f257387f).setText(context3.getString(R.string.hours_listened, Integer.valueOf(i17)));
                encoreTextView14.setText(context3.getString(R.string.hours_total, Integer.valueOf(i18)));
                int i19 = i17 * 60;
                linearProgressIndicator4.setMax(i18 * 60);
                if (i19 == 0) {
                    i19 = 1;
                }
                linearProgressIndicator4.setProgress(i19);
                ((EncoreTextView) x28Var2.f257390i).setText(mr51Var.f146431f);
                ((RelativeLayout) x28Var2.f257386e).setOnClickListener(new rsw0(15, qe1Var, tr51Var));
                if (str6.length() > 0) {
                    i3 = 0;
                    encoreTextView13.setVisibility(0);
                    encoreTextView13.setText(str6);
                } else {
                    i3 = 0;
                }
                encoreTextView14.setVisibility(8);
                encoreTextView12.setVisibility(i3);
                long j2 = 60;
                long j3 = ((long) (i18 * 3600)) - ((((long) i17) * j2) * j2);
                hvi0 hvi0Var3 = cks.f39079b;
                long jM54449D3 = jwg1.m54449D(1, ils.HOURS);
                ils ilsVar4 = ils.SECONDS;
                encoreTextView12.setText(context3.getString(R.string.hours_left, Integer.valueOf((int) Math.floor((cks.m33199r(jwg1.m54449D(29, ils.MINUTES), ilsVar4) + j3) / cks.m33199r(jM54449D3, ilsVar4)))));
                ((RelativeLayout) x28Var2.f257376L0).setVisibility(z2 ? 0 : 8);
                ((View) x28Var2.f257378N0).setVisibility(z2 ? 0 : 8);
                encoreTextView11.setVisibility(z2 ? 0 : 8);
                encoreTextView11.setText(mr51Var.f146430e);
                encoreButton2.setText(mr51Var.f146428c);
                encoreButton2.setVisibility(z2 ? 0 : 8);
                encoreButton2.setOnClickListener(new lt7(qe1Var, tr51Var, nr51Var, 22));
                return;
            case 4:
                rr51 rr51Var = (rr51) dkv0Var;
                sr51 sr51Var = (sr51) moc1Var;
                oe1 oe1Var2 = rr51Var.f201962S0;
                qr51 qr51Var = sr51Var.f213245b;
                if (qr51Var.f191740a.length() == 0) {
                    oe1Var2.f164316e.setVisibility(8);
                    ((h6j) oe1Var2.f164315d.getLayoutParams()).f88145i = 0;
                }
                EncoreTextView encoreTextView17 = oe1Var2.f164316e;
                EncoreButton encoreButton3 = oe1Var2.f164314c;
                encoreTextView17.setText(qr51Var.f191740a);
                oe1Var2.f164315d.setText(qr51Var.f191741b);
                encoreButton3.setVisibility(sr51Var.f213244a ? 0 : 8);
                encoreButton3.setText(qr51Var.f191742c);
                encoreButton3.setOnClickListener(new lt7(rr51Var.f201963T0, sr51Var, rr51Var, 23));
                return;
            case 5:
                w881 w881Var = (w881) dkv0Var;
                o981 o981Var = (o981) moc1Var;
                qe1 qe1Var2 = w881Var.f248885T0;
                int i20 = o981Var.f162967d;
                int i21 = o981Var.f162966c;
                boolean z3 = o981Var.f162970g;
                u4i u4iVar = w881Var.f248884S0;
                EncoreCard encoreCard4 = (EncoreCard) u4iVar.f226723b;
                EncoreButton encoreButton4 = (EncoreButton) u4iVar.f226725d;
                RelativeLayout relativeLayout2 = (RelativeLayout) u4iVar.f226726e;
                EncoreTextView encoreTextView18 = (EncoreTextView) u4iVar.f226729h;
                LinearProgressIndicator linearProgressIndicator5 = (LinearProgressIndicator) u4iVar.f226724c;
                EncoreTextView encoreTextView19 = (EncoreTextView) u4iVar.f226728g;
                EncoreTextView encoreTextView20 = (EncoreTextView) u4iVar.f226730i;
                EncoreTextView encoreTextView21 = (EncoreTextView) u4iVar.f226731t;
                EncoreTextView encoreTextView22 = (EncoreTextView) u4iVar.f226719X;
                Context context4 = encoreCard4.getContext();
                u881 u881Var = o981Var.f162971h;
                String str8 = u881Var.f227859b;
                String str9 = u881Var.f227863f;
                String str10 = u881Var.f227862e;
                if (str8.length() > 0) {
                    encoreTextView21.setText(u881Var.f227858a);
                    encoreTextView20.setText(u881Var.f227859b);
                    encoreTextView22.setText(str10);
                } else {
                    int i22 = o981Var.f162969f ? R.string.top_ups_info_in_use : R.string.top_ups_info_resume;
                    encoreTextView21.setText(context4.getString(R.string.consumption_tracker_top_ups));
                    encoreTextView20.setText(context4.getString(i22));
                }
                encoreTextView19.setVisibility(0);
                hvi0 hvi0Var4 = cks.f39079b;
                long jM54449D4 = jwg1.m54449D(1, ils.HOURS);
                ils ilsVar5 = ils.SECONDS;
                encoreTextView19.setText(context4.getString(R.string.hours_left, Integer.valueOf((int) Math.floor((cks.m33199r(jwg1.m54449D(29, ils.MINUTES), ilsVar5) + (((long) (i20 * 3600)) - ((long) (i21 * 3600)))) / cks.m33199r(jM54449D4, ilsVar5)))));
                ((EncoreTextView) u4iVar.f226727f).setText(context4.getString(R.string.hours_listened, Integer.valueOf(i21)));
                int i23 = i21 * 60;
                linearProgressIndicator5.setMax(i20 * 60);
                if (i23 == 0) {
                    i23 = 1;
                }
                linearProgressIndicator5.setProgress(i23);
                if (str9.length() > 0) {
                    encoreTextView18.setText(str9);
                    relativeLayout2.setOnClickListener(new v881(qe1Var2, o981Var, 0));
                } else {
                    encoreTextView18.setText(context4.getResources().getString(R.string.see_top_ups));
                    relativeLayout2.setOnClickListener(new zg11(qe1Var2, 11));
                }
                if (str10.length() > 0) {
                    encoreTextView22.setText(str10);
                } else {
                    encoreTextView22.setText(o981Var.f162965b);
                }
                ((RelativeLayout) u4iVar.f226720Y).setVisibility(z3 ? 0 : 8);
                ((View) u4iVar.f226718L0).setVisibility(z3 ? 0 : 8);
                encoreTextView22.setVisibility(z3 ? 0 : 8);
                encoreButton4.setVisibility(z3 ? 0 : 8);
                encoreButton4.setOnClickListener(new v881(qe1Var2, o981Var, 1));
                return;
            default:
                e981 e981Var = (e981) dkv0Var;
                f981 f981Var = (f981) moc1Var;
                oe1 oe1Var3 = e981Var.f57391S0;
                d981 d981Var = f981Var.f67198d;
                if (d981Var.f46747b.length() > 0) {
                    oe1Var3.f164316e.setText(d981Var.f46746a);
                    oe1Var3.f164315d.setText(d981Var.f46747b);
                    oe1Var3.f164314c.setText(d981Var.f46748c);
                } else {
                    oe1Var3.f164315d.setText(klh.m56834f(f981Var.f67195a, "\n\n", f981Var.f67196b));
                }
                oe1Var3.f164314c.setVisibility(f981Var.f67197c ? 0 : 8);
                oe1Var3.f164314c.setOnClickListener(new rsw0(19, e981Var.f57392T0, f981Var));
                return;
        }
    }
}
