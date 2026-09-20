package p204p;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.spotify.musicquizservice.p113v1.AnswerExplanation;
import com.spotify.musicquizservice.p113v1.C1072k;
import com.spotify.musicquizservice.p113v1.C1073l;
import com.spotify.musicquizservice.p113v1.CompleteQuizRequest;
import com.spotify.musicquizservice.p113v1.CompleteQuizResponse;
import com.spotify.musicquizservice.p113v1.GetQuizMetadataRequest;
import com.spotify.musicquizservice.p113v1.GetQuizMetadataResponse;
import com.spotify.musicquizservice.p113v1.GetRoundRequest;
import com.spotify.musicquizservice.p113v1.GetRoundResponse;
import com.spotify.musicquizservice.p113v1.ImageQuestion;
import com.spotify.musicquizservice.p113v1.LottieAnimation;
import com.spotify.musicquizservice.p113v1.MultipleChoiceAnswer;
import com.spotify.musicquizservice.p113v1.MusicIdentifierQuestion;
import com.spotify.musicquizservice.p113v1.Question;
import com.spotify.musicquizservice.p113v1.QuestionFeedback;
import com.spotify.musicquizservice.p113v1.RateQuestionRequest;
import com.spotify.musicquizservice.p113v1.RateQuestionResponse;
import com.spotify.musicquizservice.p113v1.ReportAnswer;
import com.spotify.musicquizservice.p113v1.RoundMetadata;
import com.spotify.musicquizservice.p113v1.Source;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class hki0 {

    /* JADX INFO: renamed from: a */
    public final oli0 f92448a;

    public hki0(oli0 oli0Var) {
        this.f92448a = oli0Var;
    }

    /* JADX INFO: renamed from: e */
    public static ryt0 m47841e(GetQuizMetadataResponse getQuizMetadataResponse) {
        ae50<GetQuizMetadataResponse.RoundMetadata> ae50VarM15825r = getQuizMetadataResponse.m15825r();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM15825r, 10));
        for (GetQuizMetadataResponse.RoundMetadata roundMetadata : ae50VarM15825r) {
            wj50.m88279p(roundMetadata);
            String imageUrl = roundMetadata.getImageUrl();
            String strM15826n = roundMetadata.m15826n();
            ae50 ae50VarM15827o = roundMetadata.m15827o();
            String strM15829q = roundMetadata.m15829q();
            LottieAnimation lottieAnimationM15828p = roundMetadata.m15828p();
            arrayList.add(new zkx0(imageUrl, strM15826n, ae50VarM15827o, strM15829q, new i8b0(lottieAnimationM15828p.m15864p(), lottieAnimationM15828p.m15863o())));
        }
        LottieAnimation lottieAnimationM15822o = getQuizMetadataResponse.m15822o();
        return new ryt0(arrayList, new i8b0(lottieAnimationM15822o.m15864p(), lottieAnimationM15822o.m15863o()), getQuizMetadataResponse.m15821n(), getQuizMetadataResponse.m15824q(), getQuizMetadataResponse.m15823p());
    }

    /* JADX INFO: renamed from: f */
    public static xkx0 m47842f(RoundMetadata roundMetadata) {
        Long lValueOf;
        flt0 clt0Var;
        String str;
        String str2;
        String str3;
        brc1 brc1Var;
        brc1 zqc1Var;
        fb6 db6Var;
        uc40 tc40Var;
        u9c1 s9c1Var;
        flt0 elt0Var;
        String strM15926q = roundMetadata.m15926q();
        String title = roundMetadata.getTitle();
        String imageUrl = roundMetadata.hasImageUrl() ? roundMetadata.getImageUrl() : null;
        String description = roundMetadata.getDescription();
        ae50 ae50VarM15924o = roundMetadata.m15924o();
        int index = roundMetadata.getIndex();
        ae50<Question> ae50VarM15925p = roundMetadata.m15925p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM15925p, 10));
        for (Question question : ae50VarM15925p) {
            wj50.m88279p(question);
            int iM15886v = question.m15886v();
            int i = iM15886v == 0 ? -1 : cki0.f39017a[edb.m38547C(iM15886v)];
            if (i != -1) {
                if (i != 1) {
                    if (i == 2) {
                        elt0Var = new elt0(question.m15889y().m15940o());
                    } else if (i == 3) {
                        ImageQuestion imageQuestionM15881q = question.m15881q();
                        elt0Var = new blt0(imageQuestionM15881q.getImageUrl(), imageQuestionM15881q.m15857p() ? imageQuestionM15881q.m15856o() : null);
                    } else if (i == 4) {
                        elt0Var = new dlt0(question.m15888x().m15905o());
                    } else if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clt0Var = elt0Var;
                } else {
                    MusicIdentifierQuestion musicIdentifierQuestionM15883s = question.m15883s();
                    clt0Var = new clt0(musicIdentifierQuestionM15883s.m15871p(), musicIdentifierQuestionM15883s.m15869n(), musicIdentifierQuestionM15883s.m15870o(), musicIdentifierQuestionM15883s.m15872r(), musicIdentifierQuestionM15883s.m15873s());
                }
                int iM15879o = question.m15879o();
                int i2 = iM15879o == 0 ? -1 : cki0.f39018b[edb.m38547C(iM15879o)];
                if (i2 != -1) {
                    if (i2 == 1) {
                        MultipleChoiceAnswer multipleChoiceAnswerM15882r = question.m15882r();
                        i35 i35Var = new i35(multipleChoiceAnswerM15882r.m15866n(), multipleChoiceAnswerM15882r.m15867p());
                        String strM15885u = question.m15885u();
                        String strM15887w = question.m15887w();
                        Duration durationM15890z = question.m15890z();
                        String str4 = description;
                        long millis = TimeUnit.NANOSECONDS.toMillis(durationM15890z.m1931q()) + TimeUnit.SECONDS.toMillis(durationM15890z.m1932r());
                        String strM15880p = question.m15876A() ? question.m15880p() : null;
                        AnswerExplanation answerExplanationM15878n = question.m15878n();
                        int iM15779u = answerExplanationM15878n.m15779u();
                        int i3 = iM15779u == 0 ? -1 : cki0.f39019c[edb.m38547C(iM15779u)];
                        if (i3 == -1) {
                            str = imageUrl;
                            str2 = strM15926q;
                            str3 = title;
                            brc1Var = null;
                        } else {
                            if (i3 == 1) {
                                str = imageUrl;
                                str2 = strM15926q;
                                str3 = title;
                                zqc1Var = new zqc1(answerExplanationM15878n.m15774o().m15781o());
                            } else if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = imageUrl;
                                str2 = strM15926q;
                                str3 = title;
                                brc1Var = null;
                            } else {
                                ae50<AnswerExplanation.VisualAsset> ae50VarM15793n = answerExplanationM15878n.m15773n().m15793n();
                                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM15793n, 10));
                                for (AnswerExplanation.VisualAsset visualAsset : ae50VarM15793n) {
                                    wj50.m88279p(visualAsset);
                                    int iM15789n = visualAsset.m15789n();
                                    int i4 = iM15789n == 0 ? -1 : cki0.f39020d[edb.m38547C(iM15789n)];
                                    String str5 = imageUrl;
                                    if (i4 != -1) {
                                        if (i4 == 1) {
                                            strM15926q = strM15926q;
                                            AnswerExplanation.ImageAsset imageAssetM15790o = visualAsset.m15790o();
                                            int iM15783o = imageAssetM15790o.m15783o();
                                            int i5 = iM15783o == 0 ? -1 : cki0.f39021e[edb.m38547C(iM15783o)];
                                            if (i5 != -1) {
                                                if (i5 == 1) {
                                                    tc40Var = new tc40(imageAssetM15790o.getUrl());
                                                } else if (i5 == 2) {
                                                    tc40Var = new sc40(imageAssetM15790o.m15784p());
                                                } else if (i5 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                db6Var = new db6(tc40Var);
                                            }
                                            throw new IllegalArgumentException("Unknown image source");
                                        }
                                        if (i4 == 2) {
                                            AnswerExplanation.VideoAsset videoAssetM15791p = visualAsset.m15791p();
                                            int iM15787p = videoAssetM15791p.m15787p();
                                            int i6 = iM15787p == 0 ? -1 : cki0.f39022f[edb.m38547C(iM15787p)];
                                            if (i6 != -1) {
                                                if (i6 == 1) {
                                                    s9c1Var = new s9c1(videoAssetM15791p.m15786o());
                                                } else if (i6 == 2) {
                                                    s9c1Var = new r9c1(videoAssetM15791p.getManifestId());
                                                } else if (i6 == 3) {
                                                    s9c1Var = new t9c1(videoAssetM15791p.m15788q());
                                                } else if (i6 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                db6Var = new eb6(s9c1Var);
                                            }
                                            throw new IllegalArgumentException("Unknown video source");
                                        }
                                        if (i4 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        arrayList2.add(new yqc1(db6Var, visualAsset.getDescription()));
                                        imageUrl = str5;
                                        strM15926q = strM15926q;
                                        title = title;
                                    }
                                    throw new IllegalArgumentException("Unknown asset source");
                                }
                                str = imageUrl;
                                str2 = strM15926q;
                                str3 = title;
                                zqc1Var = new arc1(arrayList2);
                            }
                            brc1Var = zqc1Var;
                        }
                        String strM15777s = answerExplanationM15878n.m15777s();
                        ae50<Source> ae50VarM15778t = answerExplanationM15878n.m15778t();
                        ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM15778t, 10));
                        for (Source source : ae50VarM15778t) {
                            wj50.m88279p(source);
                            arrayList3.add(new vt31(source.getTitle(), source.getUrl(), source.m15938n()));
                        }
                        arrayList.add(new wit0(strM15885u, strM15887w, clt0Var, i35Var, millis, strM15880p, new f35(strM15777s, brc1Var, arrayList3, answerExplanationM15878n.m15776r(), answerExplanationM15878n.m15775q()), question.m15877B() ? question.m15884t() : null));
                        description = str4;
                        imageUrl = str;
                        strM15926q = str2;
                        title = str3;
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalArgumentException("Unknown answer type");
            }
            throw new IllegalArgumentException("Unknown question type");
        }
        String str6 = imageUrl;
        String str7 = strM15926q;
        String str8 = title;
        String str9 = description;
        if (roundMetadata.hasUpdatedAt()) {
            Timestamp updatedAt = roundMetadata.getUpdatedAt();
            lValueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(updatedAt.m1968r()) + TimeUnit.SECONDS.toMillis(updatedAt.m1969s()));
        } else {
            lValueOf = null;
        }
        return new xkx0(str7, str8, str6, str9, ae50VarM15924o, index, arrayList, lValueOf);
    }

    /* JADX INFO: renamed from: g */
    public static RateQuestionRequest m47843g(fmg1 fmg1Var) {
        t6u0 t6u0VarM15910r = RateQuestionRequest.m15910r();
        t6u0VarM15910r.m80168r(fmg1Var.mo42155N());
        t6u0VarM15910r.m80169s(fmg1Var.mo42156O());
        boolean z = fmg1Var instanceof ljt0;
        int i = -1;
        if (z) {
            ijt0 ijt0VarM15894q = QuestionFeedback.m15894q();
            if (z) {
                i = 1;
            } else if (!(fmg1Var instanceof jjt0)) {
                if (fmg1Var instanceof kjt0) {
                    throw new IllegalStateException("QuestionRating.Clear should never be reached");
                }
                throw new NoWhenBranchMatchedException();
            }
            ijt0VarM15894q.m50834q(i);
            t6u0VarM15910r.m80167q(ijt0VarM15894q);
            return (RateQuestionRequest) t6u0VarM15910r.build();
        }
        boolean z2 = fmg1Var instanceof jjt0;
        if (!z2) {
            if (!(fmg1Var instanceof kjt0)) {
                throw new NoWhenBranchMatchedException();
            }
            t6u0VarM15910r.m80166m();
            AbstractC0269h abstractC0269hBuild = t6u0VarM15910r.build();
            wj50.m88279p(abstractC0269hBuild);
            return (RateQuestionRequest) abstractC0269hBuild;
        }
        ijt0 ijt0VarM15894q2 = QuestionFeedback.m15894q();
        if (z) {
            i = 1;
        } else if (!z2) {
            if (fmg1Var instanceof kjt0) {
                throw new IllegalStateException("QuestionRating.Clear should never be reached");
            }
            throw new NoWhenBranchMatchedException();
        }
        ijt0VarM15894q2.m50834q(i);
        jjt0 jjt0Var = (jjt0) fmg1Var;
        ijt0VarM15894q2.m50833m(jjt0Var.f113105f);
        String str = jjt0Var.f113104e;
        if (str != null) {
            ijt0VarM15894q2.m50835r(str);
        }
        t6u0VarM15910r.m80167q(ijt0VarM15894q2);
        AbstractC0269h abstractC0269hBuild2 = t6u0VarM15910r.build();
        wj50.m88279p(abstractC0269hBuild2);
        return (RateQuestionRequest) abstractC0269hBuild2;
    }

    /* JADX INFO: renamed from: h */
    public static ReportAnswer m47844h(ftw0 ftw0Var) {
        xqw0 xqw0Var;
        wqw0 wqw0VarM15915q = ReportAnswer.m15915q();
        wqw0VarM15915q.m88793r(ftw0Var.f73324a);
        int iM38547C = edb.m38547C(ftw0Var.f73325b);
        if (iM38547C == 0) {
            xqw0Var = xqw0.ANSWER_STATE_UNSPECIFIED;
        } else if (iM38547C == 1) {
            xqw0Var = xqw0.CORRECT;
        } else if (iM38547C == 2) {
            xqw0Var = xqw0.WRONG;
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            xqw0Var = xqw0.TIME_RAN_OUT;
        }
        wqw0VarM15915q.m88791m(xqw0Var);
        long j = ftw0Var.f73326c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j);
        int nanos = (int) timeUnit.toNanos(j - TimeUnit.SECONDS.toMillis(seconds));
        bks bksVarM1929s = Duration.m1929s();
        bksVarM1929s.m29723q(seconds);
        bksVarM1929s.m29722m(nanos);
        wqw0VarM15915q.m88792q((Duration) bksVarM1929s.build());
        return (ReportAnswer) wqw0VarM15915q.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47845a(String str, String str2, ArrayList arrayList, ibk ibkVar) {
        dki0 dki0Var;
        if (ibkVar instanceof dki0) {
            dki0Var = (dki0) ibkVar;
            int i = dki0Var.f49981c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dki0Var.f49981c = i - Integer.MIN_VALUE;
            } else {
                dki0Var = new dki0(this, ibkVar);
            }
        } else {
            dki0Var = new dki0(this, ibkVar);
        }
        Object objM67295c = dki0Var.f49979a;
        int i2 = dki0Var.f49981c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM67295c);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(m47844h((ftw0) it.next()));
                }
                ouf oufVarM15806q = CompleteQuizRequest.m15806q();
                oufVarM15806q.m68103r(str);
                oufVarM15806q.m68101m(arrayList2);
                if (str2 != null) {
                    oufVarM15806q.m68102q(str2);
                }
                CompleteQuizRequest completeQuizRequest = (CompleteQuizRequest) oufVarM15806q.build();
                oli0 oli0Var = this.f92448a;
                wj50.m88279p(completeQuizRequest);
                dki0Var.f49981c = 1;
                objM67295c = oli0Var.m67295c(completeQuizRequest, dki0Var);
                yuk yukVar = yuk.f276404a;
                if (objM67295c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67295c);
            }
            o2x0 o2x0Var = (o2x0) objM67295c;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return new vwt0(((CompleteQuizResponse) obj).m15807n());
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("Failed to complete quiz: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m47846b(String str, ibk ibkVar) {
        eki0 eki0Var;
        if (ibkVar instanceof eki0) {
            eki0Var = (eki0) ibkVar;
            int i = eki0Var.f60460c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eki0Var.f60460c = i - Integer.MIN_VALUE;
            } else {
                eki0Var = new eki0(this, ibkVar);
            }
        } else {
            eki0Var = new eki0(this, ibkVar);
        }
        Object objM67293a = eki0Var.f60458a;
        int i2 = eki0Var.f60460c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM67293a);
                qa10 qa10VarM15820o = GetQuizMetadataRequest.m15820o();
                qa10VarM15820o.m72415m(str);
                GetQuizMetadataRequest getQuizMetadataRequest = (GetQuizMetadataRequest) qa10VarM15820o.build();
                oli0 oli0Var = this.f92448a;
                wj50.m88279p(getQuizMetadataRequest);
                eki0Var.f60460c = 1;
                objM67293a = oli0Var.m67293a(getQuizMetadataRequest, eki0Var);
                yuk yukVar = yuk.f276404a;
                if (objM67293a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67293a);
            }
            o2x0 o2x0Var = (o2x0) objM67293a;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return m47841e((GetQuizMetadataResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("Failed to get quiz metadata: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m47847c(int i, String str, ibk ibkVar) {
        fki0 fki0Var;
        if (ibkVar instanceof fki0) {
            fki0Var = (fki0) ibkVar;
            int i2 = fki0Var.f70551c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fki0Var.f70551c = i2 - Integer.MIN_VALUE;
            } else {
                fki0Var = new fki0(this, ibkVar);
            }
        } else {
            fki0Var = new fki0(this, ibkVar);
        }
        Object objM67296d = fki0Var.f70549a;
        int i3 = fki0Var.f70551c;
        try {
            if (i3 == 0) {
                bga.m29073P(objM67296d);
                C1073l c1073lM15845p = GetRoundRequest.QuizRoundIdentifier.m15845p();
                c1073lM15845p.m15942m(str);
                c1073lM15845p.m15943q(i);
                GetRoundRequest.QuizRoundIdentifier quizRoundIdentifier = (GetRoundRequest.QuizRoundIdentifier) c1073lM15845p.build();
                C1072k c1072kM15842o = GetRoundRequest.m15842o();
                c1072kM15842o.m15941m(quizRoundIdentifier);
                GetRoundRequest getRoundRequest = (GetRoundRequest) c1072kM15842o.build();
                oli0 oli0Var = this.f92448a;
                wj50.m88279p(getRoundRequest);
                fki0Var.f70551c = 1;
                objM67296d = oli0Var.m67296d(getRoundRequest, fki0Var);
                yuk yukVar = yuk.f276404a;
                if (objM67296d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67296d);
            }
            o2x0 o2x0Var = (o2x0) objM67296d;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return m47842f(((GetRoundResponse) obj).m15846n());
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("Failed to get round: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public final Serializable m47848d(fmg1 fmg1Var, ibk ibkVar) {
        gki0 gki0Var;
        if (ibkVar instanceof gki0) {
            gki0Var = (gki0) ibkVar;
            int i = gki0Var.f80813c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gki0Var.f80813c = i - Integer.MIN_VALUE;
            } else {
                gki0Var = new gki0(this, ibkVar);
            }
        } else {
            gki0Var = new gki0(this, ibkVar);
        }
        Object objM67297e = gki0Var.f80811a;
        int i2 = gki0Var.f80813c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM67297e);
                RateQuestionRequest rateQuestionRequestM47843g = m47843g(fmg1Var);
                oli0 oli0Var = this.f92448a;
                gki0Var.f80813c = 1;
                objM67297e = oli0Var.m67297e(rateQuestionRequestM47843g, gki0Var);
                yuk yukVar = yuk.f276404a;
                if (objM67297e == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67297e);
            }
            o2x0 o2x0Var = (o2x0) objM67297e;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return ((RateQuestionResponse) obj).m15911n();
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("failed to rate question: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }
}
