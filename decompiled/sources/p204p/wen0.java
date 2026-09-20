package p204p;

import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$GetPaymentSessionRequest;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$GetPaymentSessionResponse;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$PreparePaymentRequest;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$PreparePaymentResponse;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedPaymentRequest;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedPaymentResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000e2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m24212d2 = {"Lp/wen0;", "", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$GetPaymentSessionRequest;", "req", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$GetPaymentSessionResponse;", "c", "(Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$GetPaymentSessionRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$PreparePaymentRequest;", "", "requestId", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$PreparePaymentResponse;", "e", "(Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$PreparePaymentRequest;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$ProceedPaymentRequest;", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$ProceedPaymentResponse;", "b", "(Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$ProceedPaymentRequest;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest;", "Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse;", "a", "(Lcom/spotify/payment/endpoint/proto/PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_payment_endpoint-endpoint"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface wen0 {
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Single m87901d(wen0 wen0Var, PaymentSdkNativeServiceProto$ProceedPaymentRequest paymentSdkNativeServiceProto$ProceedPaymentRequest, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: proceedPayment");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return wen0Var.m87904b(paymentSdkNativeServiceProto$ProceedPaymentRequest, str);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Single m87902f(wen0 wen0Var, PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preparePayment");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return wen0Var.m87906e(paymentSdkNativeServiceProto$PreparePaymentRequest, str);
    }

    @j3m0("payment-sdk-service/spotify.paymentsdkservice.native.v1.PaymentSdkNativeService/CallbackProceedPayment")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<PaymentSdkNativeServiceProto$CallbackProceedPaymentResponse> m87903a(@h4a PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest req);

    @j3m0("payment-sdk-service/spotify.paymentsdkservice.native.v1.PaymentSdkNativeService/ProceedPayment")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Single<PaymentSdkNativeServiceProto$ProceedPaymentResponse> m87904b(@h4a PaymentSdkNativeServiceProto$ProceedPaymentRequest req, @xe20("sp-request-id") String requestId);

    @j3m0("payment-sdk-service/spotify.paymentsdkservice.native.v1.PaymentSdkNativeService/GetPaymentSession")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: c */
    Single<PaymentSdkNativeServiceProto$GetPaymentSessionResponse> m87905c(@h4a PaymentSdkNativeServiceProto$GetPaymentSessionRequest req);

    @j3m0("payment-sdk-service/spotify.paymentsdkservice.native.v1.PaymentSdkNativeService/PreparePayment")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: e */
    Single<PaymentSdkNativeServiceProto$PreparePaymentResponse> m87906e(@h4a PaymentSdkNativeServiceProto$PreparePaymentRequest req, @xe20("sp-request-id") String requestId);
}
