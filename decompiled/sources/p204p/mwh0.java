package p204p;

import androidx.car.app.model.Alert;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.WebViewTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mwh0 {
    /* JADX INFO: renamed from: a */
    public static final String m63044a(Message message) {
        if (message instanceof Message.CreativeMessage) {
            Message.CreativeMessage creativeMessage = (Message.CreativeMessage) message;
            return creativeMessage.getSource() == MessageSource.LOCAL ? CappingKey.INSTANCE.m98355localxlX4SSM(creativeMessage.getId()) : CappingKey.INSTANCE.m98356remotexlX4SSM(creativeMessage.getLoggingData().getMessageId());
        }
        if (message instanceof Message.JITMessageStub) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final FormatType m63045b(Message message) {
        if (message instanceof Message.CreativeMessage) {
            return m63048e(((Message.CreativeMessage) message).getFormat());
        }
        if (message instanceof Message.JITMessageStub) {
            return FormatType.FORMAT_UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final String m63046c(DiscardReason discardReason) {
        if (discardReason instanceof DiscardReason.ClientMessagingPlatformNotEnabled) {
            return "CMP feature is not enabled";
        }
        if (discardReason instanceof DiscardReason.ContextSwitched) {
            return "The original context from which the message was requested changed";
        }
        if (discardReason instanceof DiscardReason.DataMalformed) {
            return ((DiscardReason.DataMalformed) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.DynamicTagResolutionFailed) {
            return ((DiscardReason.DynamicTagResolutionFailed) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.MessageExpired) {
            return "Message expiration date has passed";
        }
        if (discardReason instanceof DiscardReason.ParsingFailed) {
            return "Message could not be parsed correctly";
        }
        if (discardReason instanceof DiscardReason.PresentationFailed) {
            return ((DiscardReason.PresentationFailed) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.RequestTimedOut) {
            return "Message not loaded within 500 milliseconds";
        }
        if (discardReason instanceof DiscardReason.MessageNotFound) {
            return "Message not found";
        }
        if (discardReason instanceof DiscardReason.AdStartedPlaying) {
            return "Ad started playing";
        }
        if (discardReason instanceof DiscardReason.AppBackgrounded) {
            return "The application is in the background";
        }
        if (discardReason instanceof DiscardReason.ServiceStopped) {
            return "The CMP quasar service has stopped";
        }
        if (discardReason instanceof DiscardReason.AppIsOffline) {
            return "Unable to present this message as it requires the app to be online and the app is currently offline";
        }
        if (discardReason instanceof DiscardReason.BackendError) {
            return ((DiscardReason.BackendError) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.CarConnected) {
            return "Car mode is enabled";
        }
        if (discardReason instanceof DiscardReason.ConflictingMessagePresenting) {
            String failureDetails = ((DiscardReason.ConflictingMessagePresenting) discardReason).getFailureDetails();
            return failureDetails == null ? "Conflicting message presenting but there are no details recorded" : failureDetails;
        }
        if (discardReason instanceof DiscardReason.UserLoggingOut) {
            return "The user is logging out of the app";
        }
        if (discardReason instanceof DiscardReason.InlineCardIncorrectTriggerType) {
            return "Inline cards should always use a client event trigger type";
        }
        if (discardReason instanceof DiscardReason.NowPlayingViewPresenting) {
            return "The now-playing-view is showing";
        }
        if (discardReason instanceof DiscardReason.NoContainerFound) {
            DiscardReason.NoContainerFound noContainerFound = (DiscardReason.NoContainerFound) discardReason;
            return edb.m38566o("We failed to obtain the container for the ", noContainerFound.getFormat(), " message on ", noContainerFound.getActivityName());
        }
        if (discardReason instanceof DiscardReason.NoTooltipAnchorViewFound) {
            DiscardReason.NoTooltipAnchorViewFound noTooltipAnchorViewFound = (DiscardReason.NoTooltipAnchorViewFound) discardReason;
            return edb.m38566o("We failed to obtain the source view (anchor) ", noTooltipAnchorViewFound.getAnchorView(), " for the tooltip message on ", noTooltipAnchorViewFound.getActivityName());
        }
        if (discardReason instanceof DiscardReason.RequestDismissedConflictingPresentedMessage) {
            return s571.m77251j("We discarded this message because a new request with opportunityId ", ((DiscardReason.RequestDismissedConflictingPresentedMessage) discardReason).getRequestId(), " dismissed currently presenting conflicting messages");
        }
        if (discardReason instanceof DiscardReason.RequestAlreadyProcessing) {
            return "Request is already being processed";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final FormatType m63047d(MessagePresentationStatus messagePresentationStatus) {
        if (messagePresentationStatus instanceof MessagePresentationStatus.Presented) {
            return ((MessagePresentationStatus.Presented) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.PendingPresentation) {
            return ((MessagePresentationStatus.PendingPresentation) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.Discarded) {
            return ((MessagePresentationStatus.Discarded) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) {
            return ((MessagePresentationStatus.Dismissed) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.Processing) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public static final FormatType m63048e(Format format) {
        if (format instanceof Format.Banner) {
            return FormatType.BANNER;
        }
        if (format instanceof Format.BottomSheet) {
            return FormatType.BOTTOMSHEET;
        }
        if (format instanceof Format.Fullscreen) {
            return FormatType.FULLSCREEN;
        }
        if (format instanceof Format.InlineCard) {
            return FormatType.INLINE_CARD;
        }
        if (format instanceof Format.Modal) {
            return FormatType.MODAL;
        }
        if (format instanceof Format.SnackBar) {
            return FormatType.SNACKBAR;
        }
        if (format instanceof Format.Tooltip) {
            return FormatType.TOOLTIP;
        }
        if (format instanceof Format.WebView) {
            return FormatType.WEB_VIEW;
        }
        if (format instanceof Format.UndefinedFormat) {
            return FormatType.FORMAT_UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static final String m63049f(DiscardReason discardReason) {
        if (discardReason instanceof DiscardReason.ContextSwitched) {
            return "CONTEXT_SWITCHED";
        }
        if (discardReason instanceof DiscardReason.DataMalformed) {
            return "DATA_MALFORMED";
        }
        if (discardReason instanceof DiscardReason.DynamicTagResolutionFailed) {
            return "DYNAMIC_TAGS_RESOLVING_FAILED";
        }
        if (discardReason instanceof DiscardReason.PresentationFailed) {
            return "MESSAGE_PRESENTATION_FAILED";
        }
        if (discardReason instanceof DiscardReason.ClientMessagingPlatformNotEnabled) {
            return "CMP_NOT_ENABLED";
        }
        if (discardReason instanceof DiscardReason.MessageExpired) {
            return "EXPIRED_MESSAGE";
        }
        if (discardReason instanceof DiscardReason.ParsingFailed) {
            return "PARSING_FAILED";
        }
        if (discardReason instanceof DiscardReason.RequestTimedOut) {
            return "REQUEST_TIMED_OUT";
        }
        if (discardReason instanceof DiscardReason.MessageNotFound) {
            return "MESSAGE_NOT_FOUND";
        }
        if (discardReason instanceof DiscardReason.AppBackgrounded) {
            return "APP_IS_BACKGROUNDED";
        }
        if (discardReason instanceof DiscardReason.BackendError) {
            return "BACKEND_ERROR";
        }
        if (discardReason instanceof DiscardReason.UserLoggingOut) {
            return "USER_WILL_LOG_OUT";
        }
        if (discardReason instanceof DiscardReason.CarConnected) {
            return "CAR_CONNECTED";
        }
        if (discardReason instanceof DiscardReason.AdStartedPlaying) {
            return "AD_STARTED_PLAYING";
        }
        if (discardReason instanceof DiscardReason.ConflictingMessagePresenting) {
            return "CONFLICTING_MESSAGE_PRESENTING";
        }
        if (discardReason instanceof DiscardReason.AppIsOffline) {
            return "APP_IS_OFFLINE";
        }
        if (discardReason instanceof DiscardReason.InlineCardIncorrectTriggerType) {
            return "INLINE_CARD_INCORRECT_TRIGGER_TYPE";
        }
        if (discardReason instanceof DiscardReason.NowPlayingViewPresenting) {
            return "NOW_PLAYING_VIEW_SHOWING";
        }
        if (discardReason instanceof DiscardReason.NoContainerFound) {
            return "NO_HTML_CONTAINER_FOUND";
        }
        if (discardReason instanceof DiscardReason.NoTooltipAnchorViewFound) {
            return "NO_TOOLTIP_ANCHOR_VIEW_FOUND";
        }
        if (discardReason instanceof DiscardReason.ServiceStopped) {
            return "SERVICE_STOPPED";
        }
        if (discardReason instanceof DiscardReason.RequestDismissedConflictingPresentedMessage) {
            return "REQUEST_DISMISSED_CONFLICTING_PRESENTED_MESSAGE";
        }
        if (discardReason instanceof DiscardReason.RequestAlreadyProcessing) {
            return "REQUEST_ALREADY_PROCESSING";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m63050g(Message message, CappingState cappingState) {
        if (!(message instanceof Message.CreativeMessage)) {
            if (message instanceof Message.JITMessageStub) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        int impressionCount = cappingState.getImpressionCount();
        Set<CappingRule> cappingRules = ((Message.CreativeMessage) message).getCappingRules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cappingRules) {
            if (obj instanceof CappingRule.Impression) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((CappingRule.Impression) it.next()).getMaxImpressions()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((Number) obj2).intValue() > 0) {
                arrayList3.add(obj2);
            }
        }
        Integer num = (Integer) g6f.m43693G0(arrayList3);
        return impressionCount >= (num != null ? num.intValue() : Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m63051h(Message message, CappingState cappingState) {
        EventType eventType;
        if (!(message instanceof Message.CreativeMessage)) {
            if (message instanceof Message.JITMessageStub) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        Set<EventType> capturedInteractions = cappingState.getCapturedInteractions();
        Set<CappingRule> cappingRules = ((Message.CreativeMessage) message).getCappingRules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cappingRules) {
            if (obj instanceof CappingRule.Interaction) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Set<InteractionType> interactionsToCap = ((CappingRule.Interaction) it.next()).getInteractionsToCap();
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(interactionsToCap, 10));
            Iterator<T> it2 = interactionsToCap.iterator();
            while (it2.hasNext()) {
                int i = lwh0.f137574b[((InteractionType) it2.next()).ordinal()];
                if (i == 1) {
                    eventType = EventType.CLICK;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eventType = EventType.DISMISS;
                }
                arrayList3.add(eventType);
            }
            j6f.m52564V(arrayList3, arrayList2);
        }
        return !g6f.m43750v0(capturedInteractions, arrayList2).isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public static final LoggingData m63052i(Message message) {
        if (message instanceof Message.CreativeMessage) {
            return ((Message.CreativeMessage) message).getLoggingData();
        }
        if (message instanceof Message.JITMessageStub) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    public static final x401 m63053j(Capping capping) {
        x401 x401Var = new x401();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = capping.getEventsToCap().iterator();
        while (it.hasNext()) {
            int i = lwh0.f137575c[((EventType) it.next()).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    linkedHashSet.add(InteractionType.DISMISS);
                } else if (i == 3) {
                    x401Var.add(new CappingRule.Impression(1));
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashSet.add(InteractionType.CLICK);
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            x401Var.add(new CappingRule.Interaction(linkedHashSet));
        }
        return n0e1.m63425d(x401Var);
    }

    /* JADX INFO: renamed from: k */
    public static final Format m63054k(Html html) {
        if (html instanceof Html.Banner) {
            return new Format.Banner(((Html.Banner) html).getTemplate());
        }
        if (html instanceof Html.Fullscreen) {
            return new Format.Fullscreen(((Html.Fullscreen) html).getTemplate());
        }
        if (html instanceof Html.Modal) {
            return new Format.Modal(((Html.Modal) html).getTemplate());
        }
        if (html instanceof Html.SnackBar) {
            return new Format.SnackBar((SnackBarTemplate) ((Html.SnackBar) html).getTemplate(), false, 2, (DefaultConstructorMarker) null);
        }
        if (html instanceof Html.UnknownFormat) {
            return Format.UndefinedFormat.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final FormatType m63055l(MessageTemplate messageTemplate) {
        if (messageTemplate instanceof BannerTemplate) {
            return FormatType.BANNER;
        }
        if (messageTemplate instanceof ModalTemplate) {
            return FormatType.MODAL;
        }
        if (messageTemplate instanceof FullscreenTemplate) {
            return FormatType.FULLSCREEN;
        }
        if (messageTemplate instanceof SnackBarTemplate) {
            return FormatType.SNACKBAR;
        }
        if (messageTemplate instanceof BottomSheetTemplate) {
            return FormatType.BOTTOMSHEET;
        }
        if (messageTemplate instanceof TooltipTemplate) {
            return FormatType.TOOLTIP;
        }
        if (messageTemplate instanceof InlineCardTemplate) {
            return FormatType.INLINE_CARD;
        }
        return messageTemplate instanceof WebViewTemplate ? FormatType.WEB_VIEW : FormatType.FORMAT_UNKNOWN;
    }

    /* JADX INFO: renamed from: m */
    public static final MessagePresentationStatus m63056m(zte0 zte0Var) {
        FormatType formatType;
        FormatType formatType2;
        FormatType formatType3;
        FormatType formatType4;
        if ((zte0Var instanceof ste0) || (zte0Var instanceof tte0) || (zte0Var instanceof yte0)) {
            return new MessagePresentationStatus.Processing(zte0Var.mo79239a().f236593b, zte0Var.mo79239a().f236594c);
        }
        if (zte0Var instanceof ute0) {
            ute0 ute0Var = (ute0) zte0Var;
            v2a1 v2a1Var = ute0Var.f233902a;
            String str = v2a1Var.f236593b;
            TriggerType triggerType = v2a1Var.f236594c;
            DiscardReason discardReason = ute0Var.f233904c;
            LoggingData loggingDataM96906b = zte0Var.m96906b();
            if (loggingDataM96906b == null || (formatType4 = loggingDataM96906b.getFormatType()) == null) {
                formatType4 = FormatType.FORMAT_UNKNOWN;
            }
            return new MessagePresentationStatus.Discarded(str, triggerType, formatType4, discardReason);
        }
        if (zte0Var instanceof vte0) {
            vte0 vte0Var = (vte0) zte0Var;
            v2a1 v2a1Var2 = vte0Var.f244623a;
            String str2 = v2a1Var2.f236593b;
            TriggerType triggerType2 = v2a1Var2.f236594c;
            DismissReason dismissReason = vte0Var.f244625c;
            LoggingData loggingDataM96906b2 = zte0Var.m96906b();
            if (loggingDataM96906b2 == null || (formatType3 = loggingDataM96906b2.getFormatType()) == null) {
                formatType3 = FormatType.FORMAT_UNKNOWN;
            }
            return new MessagePresentationStatus.Dismissed(str2, triggerType2, formatType3, dismissReason);
        }
        if (zte0Var instanceof wte0) {
            wte0 wte0Var = (wte0) zte0Var;
            String str3 = wte0Var.mo79239a().f236593b;
            TriggerType triggerType3 = wte0Var.mo79239a().f236594c;
            LoggingData loggingDataM96906b3 = zte0Var.m96906b();
            if (loggingDataM96906b3 == null || (formatType2 = loggingDataM96906b3.getFormatType()) == null) {
                formatType2 = FormatType.FORMAT_UNKNOWN;
            }
            return new MessagePresentationStatus.Presented(str3, triggerType3, formatType2);
        }
        if (!(zte0Var instanceof xte0)) {
            throw new NoWhenBranchMatchedException();
        }
        v2a1 v2a1Var3 = ((xte0) zte0Var).f265855a;
        String str4 = v2a1Var3.f236593b;
        TriggerType triggerType4 = v2a1Var3.f236594c;
        LoggingData loggingDataM96906b4 = zte0Var.m96906b();
        if (loggingDataM96906b4 == null || (formatType = loggingDataM96906b4.getFormatType()) == null) {
            formatType = FormatType.FORMAT_UNKNOWN;
        }
        return new MessagePresentationStatus.PendingPresentation(str4, triggerType4, formatType);
    }

    /* JADX INFO: renamed from: n */
    public static final MessageRequest m63057n(rza rzaVar) {
        return new MessageRequest(rzaVar.f204103b, rzaVar.f204104c, null, rzaVar.f204107f, rzaVar.f204105d, rzaVar.f204108g, rzaVar.f204109h, null, rzaVar.f204111j, 132, null);
    }

    /* JADX INFO: renamed from: o */
    public static final rza m63058o(MessageRequest messageRequest, String str) {
        return new rza(str, messageRequest.getTriggerPattern(), messageRequest.getTriggerType(), messageRequest.getPageUri(), messageRequest.getInteractionLoggingResult(), messageRequest.getRulesConfig(), messageRequest.getDynamicTagsMetadata(), messageRequest.getOrchestrationMetadata(), 272);
    }

    /* JADX INFO: renamed from: p */
    public static final v2a1 m63059p(MessageRequest messageRequest, String str) {
        String entityUri;
        String triggerPattern = messageRequest.getTriggerPattern();
        TriggerType triggerType = messageRequest.getTriggerType();
        String pageUri = messageRequest.getPageUri();
        DynamicTagsMetadata dynamicTagsMetadata = messageRequest.getDynamicTagsMetadata();
        if (dynamicTagsMetadata == null || (entityUri = dynamicTagsMetadata.getEntityUri()) == null) {
            entityUri = "";
        }
        return new v2a1(str, triggerPattern, triggerType, pageUri, entityUri);
    }

    /* JADX INFO: renamed from: q */
    public static final v2a1 m63060q(rza rzaVar) {
        String entityUri;
        String str = rzaVar.f204102a;
        String str2 = rzaVar.f204103b;
        TriggerType triggerType = rzaVar.f204104c;
        String str3 = rzaVar.f204105d;
        DynamicTagsMetadata dynamicTagsMetadata = rzaVar.f204109h;
        if (dynamicTagsMetadata == null || (entityUri = dynamicTagsMetadata.getEntityUri()) == null) {
            entityUri = "";
        }
        return new v2a1(str, str2, triggerType, str3, entityUri);
    }
}
