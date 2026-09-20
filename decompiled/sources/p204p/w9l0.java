package p204p;

import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m24212d2 = {"Lp/w9l0;", "", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/StartTrialRequest;", "request", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/StartTrialResponse;", "a", "(Lcom/spotify/ondemandtrials/trialstartimpl/proto/StartTrialRequest;Lp/fbk;)Ljava/lang/Object;", "Lp/w2a1;", "b", "(Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/CheckEligibilityRequest;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/CheckEligibilityResponse;", "d", "(Lcom/spotify/ondemandtrials/trialstartimpl/proto/CheckEligibilityRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/GetTrialRequest;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/GetTrialResponse;", "c", "(Lcom/spotify/ondemandtrials/trialstartimpl/proto/GetTrialRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_ondemandtrials_trialstartimpl-trialstartimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface w9l0 {
    @j3m0("trials-facade/v2/start-trial")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m87519a(@h4a StartTrialRequest startTrialRequest, fbk<? super StartTrialResponse> fbkVar);

    @j3m0("trials-facade/start-trial")
    /* JADX INFO: renamed from: b */
    Object m87520b(fbk<? super w2a1> fbkVar);

    @j3m0("trial-metadata/get-trial")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m87521c(@h4a GetTrialRequest getTrialRequest, fbk<? super GetTrialResponse> fbkVar);

    @j3m0("trials-facade/check-eligibility/on-demand")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m87522d(@h4a CheckEligibilityRequest checkEligibilityRequest, fbk<? super CheckEligibilityResponse> fbkVar);
}
