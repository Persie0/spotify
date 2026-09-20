package p204p;

import com.spotify.familyverify.p064v1.AcknowledgeQrCodeVerificationStartNotificationRequest;
import com.spotify.familyverify.p064v1.GetQrCodeVerificationOnboardingRequest;
import com.spotify.familyverify.p064v1.GetQrCodeVerificationOnboardingResponse;
import com.spotify.familyverify.p064v1.StartQrCodeVerificationFlowRequest;
import com.spotify.familyverify.p064v1.StartQrCodeVerificationFlowResponse;
import com.spotify.familyverify.p064v1.TriggerQrCodeVerificationStartNotificationRequest;
import com.spotify.familyverify.p064v1.VerifyQrCodeRequest;
import com.spotify.familyverify.p064v1.VerifyQrCodeResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m24212d2 = {"Lp/p9i0;", "", "Lcom/spotify/familyverify/v1/GetQrCodeVerificationOnboardingRequest;", "request", "Lcom/spotify/familyverify/v1/GetQrCodeVerificationOnboardingResponse;", "a", "(Lcom/spotify/familyverify/v1/GetQrCodeVerificationOnboardingRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/StartQrCodeVerificationFlowRequest;", "Lcom/spotify/familyverify/v1/StartQrCodeVerificationFlowResponse;", "b", "(Lcom/spotify/familyverify/v1/StartQrCodeVerificationFlowRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/VerifyQrCodeRequest;", "Lcom/spotify/familyverify/v1/VerifyQrCodeResponse;", "c", "(Lcom/spotify/familyverify/v1/VerifyQrCodeRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/TriggerQrCodeVerificationStartNotificationRequest;", "d", "(Lcom/spotify/familyverify/v1/TriggerQrCodeVerificationStartNotificationRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/AcknowledgeQrCodeVerificationStartNotificationRequest;", "e", "(Lcom/spotify/familyverify/v1/AcknowledgeQrCodeVerificationStartNotificationRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_multiuserplanverification_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface p9i0 {
    @j3m0("/spotify.familyverify.v1.MupVerificationMobileViewService/GetQrCodeVerificationOnboarding")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m69395a(@h4a GetQrCodeVerificationOnboardingRequest getQrCodeVerificationOnboardingRequest, fbk<? super GetQrCodeVerificationOnboardingResponse> fbkVar);

    @j3m0("/spotify.familyverify.v1.MupVerificationMobileViewService/StartQrCodeVerificationFlow")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m69396b(@h4a StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest, fbk<? super StartQrCodeVerificationFlowResponse> fbkVar);

    @j3m0("/spotify.familyverify.v1.MupVerificationMobileViewService/VerifyQrCode")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m69397c(@h4a VerifyQrCodeRequest verifyQrCodeRequest, fbk<? super VerifyQrCodeResponse> fbkVar);

    @j3m0("/spotify.familyverify.v1.MupVerificationMobileViewService/TriggerQrCodeVerificationStartNotification")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m69398d(@h4a TriggerQrCodeVerificationStartNotificationRequest triggerQrCodeVerificationStartNotificationRequest, fbk<Object> fbkVar);

    @j3m0("/spotify.familyverify.v1.MupVerificationMobileViewService/AcknowledgeQrCodeVerificationStartNotification")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m69399e(@h4a AcknowledgeQrCodeVerificationStartNotificationRequest acknowledgeQrCodeVerificationStartNotificationRequest, fbk<Object> fbkVar);
}
