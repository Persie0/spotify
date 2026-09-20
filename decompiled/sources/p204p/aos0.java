package p204p;

import com.spotify.promptablesection.feedback.p133v1.PromptedContentFeedbackEvent;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.songdna.feedback.p155v1.SubmitFeedbackRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class aos0 implements uwj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17761a;

    /* JADX INFO: renamed from: b */
    public final Object f17762b;

    public /* synthetic */ aos0(Object obj, int i) {
        this.f17761a = i;
        this.f17762b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static PromptedContentFeedbackEvent m26621a(bos0 bos0Var, boolean z, int i, String str) {
        zos0 zos0VarM19936v = PromptedContentFeedbackEvent.m19936v();
        zos0VarM19936v.m96636t(bos0Var.f29244a);
        zos0VarM19936v.m96639w(bos0Var.f29245b);
        zos0VarM19936v.m96638v(bos0Var.f29246c);
        zos0VarM19936v.m96634r(bos0Var.f29247d);
        zos0VarM19936v.m96632m(bos0Var.f29248e);
        zos0VarM19936v.m96635s(z);
        zos0VarM19936v.m96633q(i);
        zos0VarM19936v.m96637u(str);
        return (PromptedContentFeedbackEvent) zos0VarM19936v.build();
    }

    @Override // p204p.uwj
    /* JADX INFO: renamed from: b */
    public final Object mo26622b(String str, fbk fbkVar) {
        switch (this.f17761a) {
            case 0:
                bos0 bos0VarM41611z = fgg1.m41611z(str);
                if (bos0VarM41611z == null) {
                    return new rwj(new IllegalArgumentException("Invalid metadata"));
                }
                ((qre0) this.f17762b).m73616a(m26621a(bos0VarM41611z, true, 0, ""));
                return swj.f214674a;
            default:
                return swj.f214674a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.uwj
    /* JADX INFO: renamed from: f */
    public final Object mo26623f(gfj0 gfj0Var, fbk fbkVar) {
        vo31 vo31Var;
        nky nkyVar;
        yuk yukVar;
        aos0 aos0Var;
        switch (this.f17761a) {
            case 0:
                bos0 bos0VarM41611z = fgg1.m41611z(gfj0Var.f79367a);
                if (bos0VarM41611z == null) {
                    return new rwj(new IllegalArgumentException("Invalid metadata"));
                }
                String str = gfj0Var.f79368b;
                String strM88489m1 = str != null ? wl51.m88489m1(AudioEpisode.SHOW_URI_FIELD_NUMBER, str) : "";
                ffj0 ffj0Var = gfj0Var.f79369c;
                int i = ffj0Var == null ? -1 : zns0.f284551a[ffj0Var.ordinal()];
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        i2 = 3;
                        if (i != 3) {
                            i2 = 4;
                            if (i != 4) {
                                i2 = 5;
                                if (i != 5) {
                                    i2 = 0;
                                }
                            }
                        }
                    }
                }
                ((qre0) this.f17762b).m73616a(m26621a(bos0VarM41611z, false, i2, strM88489m1));
                return swj.f214674a;
            default:
                if (fbkVar instanceof vo31) {
                    vo31Var = (vo31) fbkVar;
                    int i3 = vo31Var.f243343d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vo31Var.f243343d = i3 - Integer.MIN_VALUE;
                    } else {
                        vo31Var = new vo31(this, (ibk) fbkVar);
                    }
                } else {
                    vo31Var = new vo31(this, (ibk) fbkVar);
                }
                Object objM91526a = vo31Var.f243341b;
                int i4 = vo31Var.f243343d;
                if (i4 == 0) {
                    bga.m29073P(objM91526a);
                    xo31 xo31Var = (xo31) this.f17762b;
                    String str2 = gfj0Var.f79368b;
                    os51 os51VarM21486s = SubmitFeedbackRequest.m21486s();
                    os51VarM21486s.m67709r(gfj0Var.f79367a);
                    ffj0 ffj0Var2 = gfj0Var.f79369c;
                    switch (ffj0Var2 == null ? -1 : wo31.f253364a[ffj0Var2.ordinal()]) {
                        case -1:
                            nkyVar = nky.CATEGORY_SOMETHING_ELSE;
                            break;
                        case 0:
                        default:
                            throw new IllegalArgumentException("Unexpected FeedbackOption for SongDNA: " + ffj0Var2);
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            nkyVar = nky.CATEGORY_SONG_CREDITS;
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            nkyVar = nky.CATEGORY_SAMPLES_OR_COVERS;
                            break;
                    }
                    os51VarM21486s.m67708q(nkyVar);
                    switch (ffj0Var2 != null ? wo31.f253364a[ffj0Var2.ordinal()] : -1) {
                        case -1:
                            if (str2 != null && str2.length() != 0) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 0:
                        default:
                            throw new IllegalArgumentException("Unexpected FeedbackOption for SongDNA: " + ffj0Var2);
                        case 1:
                            os51VarM21486s.m67711t(cl31.SONG_CREDITS_ISSUE_MISSING_CREDIT);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest2 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest2, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 2:
                            os51VarM21486s.m67711t(cl31.SONG_CREDITS_ISSUE_EXTRA_OR_DUPLICATE);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest3 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest3, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 3:
                            os51VarM21486s.m67711t(cl31.SONG_CREDITS_ISSUE_INCORRECT_ROLE);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest4 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest4, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 4:
                            os51VarM21486s.m67711t(cl31.SONG_CREDITS_ISSUE_MISSPELT);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest5 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest5, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 5:
                            os51VarM21486s.m67711t(cl31.SONG_CREDITS_ISSUE_OTHER);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest6 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest6, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 6:
                            os51VarM21486s.m67710s(r1y0.SAMPLES_OR_COVERS_ISSUE_MISSING_SAMPLE_OR_INTERPOLATION);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest7 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest7, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 7:
                            os51VarM21486s.m67710s(r1y0.SAMPLES_OR_COVERS_ISSUE_INCORRECT_SAMPLE_OR_INTERPOLATION);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest8 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest8, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 8:
                            os51VarM21486s.m67710s(r1y0.SAMPLES_OR_COVERS_ISSUE_MISSING_ORIGINAL_SONG);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest9 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest9, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 9:
                            os51VarM21486s.m67710s(r1y0.SAMPLES_OR_COVERS_ISSUE_INCORRECT_ORIGINAL_SONG);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest10 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest10, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                        case 10:
                            os51VarM21486s.m67710s(r1y0.SAMPLES_OR_COVERS_ISSUE_OTHER);
                            if (str2 != null) {
                                os51VarM21486s.m67707m(str2);
                            }
                            SubmitFeedbackRequest submitFeedbackRequest11 = (SubmitFeedbackRequest) os51VarM21486s.build();
                            vo31Var.f243340a = this;
                            vo31Var.f243343d = 1;
                            objM91526a = xo31Var.m91526a(submitFeedbackRequest11, vo31Var);
                            yukVar = yuk.f276404a;
                            if (objM91526a == yukVar) {
                                return yukVar;
                            }
                            aos0Var = this;
                            break;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aos0Var = vo31Var.f243340a;
                    bga.m29073P(objM91526a);
                }
                o2x0 o2x0Var = (o2x0) objM91526a;
                aos0Var.getClass();
                return o2x0Var.f161171a.f149852O0 ? swj.f214674a : new rwj(new Exception(s571.m77246e(o2x0Var.f161171a.f149860d, "Failed to submit feedback, status: ")));
        }
    }
}
