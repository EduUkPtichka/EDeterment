import SwiftUI
import shared

struct AuthPhoneNumber: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        return RegPreviewIosPhoneNumber()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
        
    }
}

