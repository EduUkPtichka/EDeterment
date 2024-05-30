//
//  ScreenRootContent.swift
//  iosApp
//
//  Created by Элдияр Укенов on 30.05.2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

struct ScreenRootView: UIViewControllerRepresentable {
    let root: RootComponent

    func makeUIViewController(context: Context) -> UIViewController {
        return RootViewControllerKt.rootViewController(root: root)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
    }
}
